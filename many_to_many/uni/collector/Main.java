package many_to_many.uni.collector;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many.uni1.dto.Language;
import many_to_many.uni1.dto.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Language l1=new Language();
l1.setId(10);
l1.setCountry("india");
l1.setName("kannada");
l1.setOrigin("bangalore");

Language l2=new Language();
l2.setId(20);
l2.setCountry("india");
l2.setName("kannada");
l2.setOrigin("bangalore");

Language l3=new Language();
l3.setId(30);
l3.setCountry("india");
l3.setName("kannada");
l3.setOrigin("bangalore");

Person p1=new Person();
p1.setAddress("mysore");
p1.setId(4);
p1.setName("yash");
p1.setPhone(710);

Person p2=new Person();
p2.setAddress("mysore");
p2.setId(5);
p2.setName("yash");
p2.setPhone(710);

Person p3=new Person();
p3.setAddress("mysore");
p3.setId(6);
p3.setName("yash");
p3.setPhone(710);

//all 3 persons speak 3 languages

List<Language>list=new ArrayList<Language>();
list.add(l1);
list.add(l2);
list.add(l3);


p1.setList(list);
p2.setList(list);
p3.setList(list);


EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

entityTransaction.begin();
entityManager.persist(l1);
entityManager.persist(l2);
entityManager.persist(l3);

entityManager.persist(p1);
entityManager.persist(p2);
entityManager.persist(p3);


entityTransaction.commit();
	}

}
