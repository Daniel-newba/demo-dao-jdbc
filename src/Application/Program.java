package Application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        //Department obj2 = new Department(1, "Books");
        //Seller seller = new Seller(21, "bob","dani@gmail.com", new Date(), 3000.0, obj);

        //System.out.println(obj2);
        //System.out.println(seller);

        System.out.println("=== test 1: SELLER FINDBYID =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== test 2: SELLER FINDBYID DEPARTMENT =====");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("=== test 3: SELLER FINDALL =====");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== test 4: SELLER INSERT =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(),3000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Insert " + newSeller.getId());

        System.out.println("=== test 5: SELLER INSERT =====");
        seller = sellerDao.findById(1);
        seller.setName("Marta ARA");
        sellerDao.update(seller);
        System.out.println("update completed");
    }
}