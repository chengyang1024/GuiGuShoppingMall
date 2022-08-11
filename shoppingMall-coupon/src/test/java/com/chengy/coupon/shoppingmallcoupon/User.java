package com.chengy.coupon.shoppingmallcoupon;



public class User {
    private String name;
    private String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if(o==null) {
            return true;
        }
        User obj = (User)o;
        if(name.equals(obj.name) && age.equals(obj.age) ) {
            return true;
        }
        return false;
    }

}
