package by.it_academy.Lesson10.homework_my_exception;

public class Test {
    public static void main(String[] args) {
        methProcess(102);
    }

    private static void methProcess(int i) {
        try {
            methExc(i);
        } catch (MyE4 e) {
            System.out.println("MyException 4");
            e.printStackTrace();
        } catch (MyE3 e) {
            System.out.println("MyException 3");
            e.printStackTrace();
        } catch (MyE2 e) {
            System.out.println("MyException 2");
            e.printStackTrace();
        } catch (MyE1 e) {
            System.out.println("MyException 1");
            e.printStackTrace();
        }
    }

    private static void methExc(int i) throws MyE1, MyE2 {
        if (i < 10) {
            throw new MyE2("Exception number 2");
        } else {
            if (i < 20) {
                throw new MyE1("Exception number 1");
            } else {
                if (i > 1000) {
                    throw new MyE4("Exception number 4");
                } else {
                    if (i > 100) {
                        throw new MyE3("Exception number 3");
                    }
                }
            }
        }
    }
}

