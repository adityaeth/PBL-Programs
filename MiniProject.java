public class MiniProject {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please Provide Emp. Id!");
            System.exit(0);
        }
        String search = args[0];
        char designCode = '\0';
        String desig = "";
        int salary = 0;
        String[] head = { "Emp No.", "Emp Name", "Department", "Designation", "Salary" };
        String[][] employee = { { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000" },
                { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000" },
                { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" },
                { "1004", "Chahat", "29/01/2013", "r", "Front", "Desk", "12000", "6000", "2000" },
                { "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000" },
                { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400" },
                { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000" } };

        String[][] designation = { { "e", "Engineer", "20000" }, { "c", "Consultant", "32000" },
                { "k", "Clerk", "12000" }, { "r", "Receptionist", "15000" }, { "m", "Manager", "40000" } };

        String[] sTable = new String[5];
        for (int i = 0; i < employee.length - 1; i++) {
            for (int j = 0, index = 0; j < employee.length - 2; j++) {
                if (search.equals(employee[i][0])) {
                    if (j != 2 && j != 3) {
                        sTable[index++] = employee[i][j];
                        designCode = employee[i][3].charAt(0);
                    }
                }
            }
            switch (designCode) {
                case 'e':
                    desig = "Engineer";
                    salary = Integer.parseInt(employee[i][5]) + Integer.parseInt(employee[i][6]) + 20000
                            - Integer.parseInt(employee[i][7]);
                    break;
                case 'c':
                    desig = "Consultant";
                    salary = Integer.parseInt(employee[i][5]) + Integer.parseInt(employee[i][6]) + 32000
                            - Integer.parseInt(employee[i][7]);
                    break;
                case 'k':
                    desig = "Clerk";
                    salary = Integer.parseInt(employee[i][5]) + Integer.parseInt(employee[i][6]) + 12000
                            - Integer.parseInt(employee[i][7]);
                    break;
                case 'r':
                    desig = "Receptionist";
                    salary = Integer.parseInt(employee[i][5]) + Integer.parseInt(employee[i][6]) + 15000
                            - Integer.parseInt(employee[i][7]);
                    break;
                case 'm':
                    desig = "Manager";
                    salary = Integer.parseInt(employee[i][5]) + Integer.parseInt(employee[i][6]) + 40000
                            - Integer.parseInt(employee[i][7]);
                    break;
            }
        }
        if (sTable[0] == null) {
            System.out.println("There is no employee with empid " + search);
        } else {
            for (String title : head) {
                System.out.print(title + "\t");
            }
            System.out.println(sTable[0] + "\t" + sTable[1] + "\t" + sTable[2] + "\t" + desig + "\t" + salary);

        }
    }
}
