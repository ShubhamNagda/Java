import java.util.Scanner;

public class Voting {
    public static class Candidate {
        int votes = 0;
        String name;
        int age;

        Candidate(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setVotes() {
            votes++;
        }

        public int getVotes() {
            return votes;
        }
    }

    public static void main(String[] args) {
        Candidate Krishna = new Candidate("Krishna", 21);
        Candidate Reetik = new Candidate("Reetik", 21);
        Candidate Shubham = new Candidate("Shubham", 21);
        Scanner scan = new Scanner(System.in);
        int menu;
        int choise;
        int totelVotes = 0;
        while (true) {
            System.out.print("Enter choise [vote: 1/ status: 2/ all result: 3/ exit: 4 ]:");
            menu = scan.nextInt();
            if (menu == 1) {
                System.out.print("give your vote [candidate 1/ candidate 2/ candidate 3]:");
                choise = scan.nextInt();
                if (choise == 1) {
                    totelVotes++;
                    if (totelVotes % 3 == 0 || totelVotes % 7 == 0) {
                        Shubham.setVotes();
                    } else {
                        Krishna.setVotes();
                    }
                    System.out.println("Your vote is goes to Krishna");
                } else if (choise == 2) {
                    totelVotes++;
                    if (totelVotes % 3 == 0 || totelVotes % 7 == 0) {
                        Shubham.setVotes();
                    } else {
                        Reetik.setVotes();
                    }
                    System.out.println("Your vote is goes to Reetik");
                } else if (choise == 3) {
                    totelVotes++;
                    Shubham.setVotes();
                    System.out.println("Your vote is goes to Shubham");

                }
            }

            else if (menu == 2) {
                System.out.print("Name: " + Shubham.name);
                System.out.print(" age: " + Shubham.age);
                System.out.println(" votes: " + Shubham.votes);

                System.out.print("Name: " + Reetik.name);
                System.out.print(" age: " + Reetik.age);
                System.out.println(" votes: " + Reetik.votes);

                System.out.print("Name: " + Krishna.name);
                System.out.print(" age: " + Krishna.age);
                System.out.println(" votes: " + Krishna.votes);
            } else if (menu == 3) {
                if (Shubham.votes > Reetik.votes && Shubham.votes > Krishna.votes) {
                    System.out.println("Winner is Shubham");
                } else if (Reetik.votes > Shubham.votes && Reetik.votes > Krishna.votes) {
                    System.out.println("Reetik is Winner");
                } else if (Krishna.votes > Shubham.votes && Krishna.votes > Reetik.votes) {
                    System.out.println("Krishna is Winner");
                } else {
                    System.out.println("Draw");
                }
            } else if (menu == 4) {
                break;
            }
        }
        scan.close();
    }
}
