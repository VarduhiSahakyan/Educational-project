package service;

import dao.RegisterDao;
import model.Member;


public class RegisterService {

    public String  insert(Member member) {

        RegisterDao registerDao = new RegisterDao();
        String result = registerDao.insert(member);

        if (member.getUsername() == null) {
           result = String.valueOf(new NullPointerException());
        }

        if (member.getEmail() == null) {
            result = String.valueOf(new NullPointerException());
        }
        if (member.getPhone() == null) {
            result = String.valueOf(new NullPointerException());
        }
        if (member.getPassword() == null) {
            result = String.valueOf(new NullPointerException());
        }
        return result;
    }
}
