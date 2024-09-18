package Application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        //Seller seller = new Seller(21, "bob","dani@gmail.com", new Date(), 3000.0, obj);

        System.out.println(obj);
        //System.out.println(seller);

        System.out.println("=== test 1: SELLER FINDBYID =====");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}