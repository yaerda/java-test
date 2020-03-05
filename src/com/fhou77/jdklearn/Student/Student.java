package com.fhou77.jdklearn.Student;

public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private class cls {
        private String clsName;

        public String getClsName() {
            System.out.println("当前是学生：" + getName());
            return clsName;
        }

        StringBuffer bf = new StringBuffer();
        StringBuilder sb = new StringBuilder();

        public void setClsName(String clsName) {
            this.clsName = clsName;
        }
    }
}
