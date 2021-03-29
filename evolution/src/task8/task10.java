package task8;

public class task10 {
	public static void main(String args[]) {
		checkedEmployee empChecked = new checkedEmployee();
		uncheckedEmployee empUnchecked = new uncheckedEmployee();
		salDesc salDescComp= new salDesc();
		empChecked.addList("Burak", "Gurel", 1500.0);
		empChecked.addList("Lil", "Peep", 900.0);
		empChecked.addList("Kendrick", "Lamar", 2500.0);
		Firm checkedFirm = new Firm("Checked Firm");
		checkedFirm.add(empChecked.getList());
		System.out.println(checkedFirm + "\n" + "\n" + "Maximal Salary:" + empChecked.getMaxSalary() + "\n");
		empChecked.sortSalariesAsc(checkedFirm.getList());
		System.out.println("Sorted in ascending order \n");
		System.out.println(checkedFirm + "\n" + "\n" + "Maximal Salary:" + empChecked.getMaxSalary() + "\n");
		empChecked.sortSalariesDesc(checkedFirm.getList(), salDescComp);
		System.out.println("Sorted in descending order \n");
		System.out.println(checkedFirm + "\n" + "\n" + "Maximal Salary:" + empChecked.getMaxSalary() + "\n");
		empUnchecked.addList("Ahmet", "Elma", 1700.0);
		empUnchecked.addList("Ayse", "Mustafa", 700.0);
		empUnchecked.addList("Faruk", "Musa", 1850.0);
		Firm uncheckedFirm = new Firm("Unchecked Firm");
		uncheckedFirm.add(empUnchecked.getList());
		System.out.println(uncheckedFirm + "\n" + "\n" + "Maximal Salary:" + empUnchecked.getMaxSalary() + "\n");
		empUnchecked.sortSalariesAsc(uncheckedFirm.getList());
		System.out.println("Sorted in ascending order \n");
		System.out.println(uncheckedFirm + "\n" + "\n" + "Maximal Salary:" + empUnchecked.getMaxSalary() + "\n");
		empUnchecked.sortSalariesDesc(uncheckedFirm.getList(), salDescComp);
		System.out.println("Sorted in descending order \n");
		System.out.println(uncheckedFirm + "\n" + "\n" + "Maximal Salary:" + empUnchecked.getMaxSalary() + "\n");
		

	}
}
