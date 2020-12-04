package rtu.mirea.lab9;

import java.util.Scanner;
import static java.lang.System.*;

public class LabClassUI {
    LabClass labClass;

    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver driver = new LabClassDriver(labClass);
        Scanner in = new Scanner(System.in);
        boolean created = false;
        out.print("Хотите ли Вы создать новый список? 1 - да, 2 - нет\n");
        int choice = in.nextInt();

            if (choice == 1) {
                driver.createLabClass();
                created = true;
            }
            else if (choice == 2) {
                driver.fillLabClass();
            }
            else {
                err.print("Вы совершили неправильный ввод! Попробуйте снова.\n");
                out.print("Хотите ли Вы создать новый список? 1 - да, 2 - нет\n");
                choice = in.nextInt();
                if (choice == 1) {
                    driver.createLabClass();
                    created = true;
                }
                else if (choice == 2) {
                    driver.fillLabClass();
                }
            }

            if (created) {
                out.println("Хотите сохранить список? 1 - да, 2 - нет\n");
                choice = in.nextInt();
                if (choice == 1) {
                    driver.saveLabCLass();
                }
                else
                    driver.fillLabClass();
            }
        }

    public void findStudent() {
        Scanner in = new Scanner(System.in);
        out.print("Введите имя студента, которого хотите найти:\n");
        String name;

        try {
            name = in.nextLine();
            if (name.isEmpty()) {

                throw new EmptyStringException("Вы ввели пустую строку!");
            }
        }
        catch (EmptyStringException e) {
            err.println(e.getMessage());
            out.println();
            findStudent();
            return;
        }

        try {
            out.println(labClass.find(name).toString());
        }
        catch (StudentException e) {
            err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        LabClassUI app = new LabClassUI();
        app.findStudent();
    }
}

