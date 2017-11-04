package ClassOfStudents;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Comparator;

public class Stutent {
	private int id;
	private int age;
	private String name;
	private String secondname;

	ArrayList<Stutent> listofstunets = new ArrayList<Stutent>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public Stutent(int id, String name, String secondname, Integer age) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.secondname = secondname;
	}

	public Stutent() {
		// TODO Auto-generated constructor stub
	}

	public Stutent(Stutent stutent) {
		this.id = stutent.getId();
		this.age = stutent.getAge();
		this.name = stutent.getName();
		this.secondname = stutent.getSecondname();
	}

	@Override
	public String toString() {
		return "Stutent [id=" + id + ", age=" + age + ", name=" + name + ", secondname=" + secondname + "]";
	}

	// Создает список студентов
	public void CreateList() {

		Stutent s1 = new Stutent(0, "Vasia", "Vasileev", 25);
		Stutent s2 = new Stutent(1, "Petr", "Petrov", 24);
		Stutent s3 = new Stutent(2, "Igor", "Gogo", 20);
		Stutent s4 = new Stutent(3, "Tom", "Lazy", 33);
		Stutent s5 = new Stutent(4, "Angelina", "Kuznetsova", 99);
		Stutent s6 = new Stutent(5, "Mike", "Gordey", 15);
		Stutent s7 = new Stutent(6, "Mikky", "Seleznev", 29);
		Stutent s8 = new Stutent(7, "Roma", "Ivaniv", 25);
		Stutent s9 = new Stutent(108, "Diana", "Vasileeva", 26);
		Stutent s10 = new Stutent(109, "Chel", "Mutney", 23);

		listofstunets.add(s1);
		listofstunets.add(s2);
		listofstunets.add(s3);
		listofstunets.add(s4);
		listofstunets.add(s5);
		listofstunets.add(s6);
		listofstunets.add(s7);
		listofstunets.add(s8);
		listofstunets.add(s9);
		listofstunets.add(s10);
		listofstunets.add(s1);
		listofstunets.add(s2);

	}

	// Выводит список студентов
	public void StudentInList(ArrayList<Stutent> listofstunet) {
		ListIterator<Stutent> iter = listofstunet.listIterator();
		while (iter.hasNext()) {
			Stutent t1 = new Stutent(iter.next());
			System.out.println(t1.toString());
		}
	}

	// Сортировка по возросту
	public void SortByAge() {
		listofstunets.sort(new Comparator<Stutent>() {
			@Override
			public int compare(Stutent o1, Stutent o2) {
				if (o1.getAge() == o2.getAge())
					return 0;
				else if (o1.getAge() > o2.getAge())
					return 1;
				else
					return -1;
			}
		});
	}

	// Фильтрация по первой букве фамилии
	public ArrayList<Stutent> SortBySecondName(String firstletter) {
		ArrayList<Stutent> sortlist = new ArrayList<Stutent>();
		String secname;
		ListIterator<Stutent> iter = listofstunets.listIterator();
		while (iter.hasNext()) {
			Stutent t1 = new Stutent(iter.next());
			secname = t1.getSecondname().toLowerCase().substring(0, 1);
			if (secname.equals(firstletter.toLowerCase())) {
				sortlist.add(t1);
			}
		}
		return sortlist;
	}

	// Средний возраст
	public Double Averageage(ArrayList<Stutent> listofstunet) {
		Double averageage = (double) 0;
		Integer amountstut = 0;
		ListIterator<Stutent> iter = listofstunet.listIterator();
		while (iter.hasNext()) {
			Stutent t1 = new Stutent(iter.next());
			averageage = averageage + t1.getAge();
			amountstut++;
		}
		averageage = averageage / amountstut;
		return averageage;
	}
	//Преобразование списка в map где ключ id  значения student
	public Map<Integer, Stutent> ListInToMap(ArrayList<Stutent> listofstunet) {
		Map<Integer, Stutent> map = new HashMap<Integer, Stutent>();
		ListIterator<Stutent> iter = listofstunet.listIterator();
		while (iter.hasNext()) {
			Stutent t1 = new Stutent(iter.next());
			map.put(t1.getId(), t1);
		}
		return map;

	}
	//
	public Map<Integer, Stutent> St(Map<Integer, Stutent> map) {
		Map<Integer, Stutent> newmapwherediover100 =new HashMap<Integer, Stutent>();
		for (Map.Entry entry : map.entrySet()) {
			Integer key = (Integer) entry.getKey();
			Stutent value = (Stutent) entry.getValue();
			if (value.getId() > 100) {
					newmapwherediover100.put(key, value);
			}
		}
		System.out.println(newmapwherediover100.get(108));
		return newmapwherediover100;
	}

	public static void main(String[] args) {
		Stutent st = new Stutent();
		st.CreateList();
		st.St(st.ListInToMap(st.SortBySecondName("v")));

	}
}
