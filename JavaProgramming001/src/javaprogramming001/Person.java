/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming001;

/**
 *
 * @author Andrei
 */
 public class Person implements /*Cloneable*/Comparable{
    
        private String name;
        private String address;
        private int age;
        
        public Person(String name, String address, int age)
        {
            this.name=name;
            this.address=address;
            this.age=age;
        }
        public Person()
        {
            
        }
        public Person(String name, int age){
            this.name=name;
            this.age=age;
        }
        
        public void setName(String name)
        {
            this.name= name;
        }
        public String getName()
        {
            return name;
        }
        protected void setAddress(String address)
        {
            this.address=address;
        }
        protected String getAddress()
        {
            return address;
        }
        public void setAge(int age)
        {
            this.age= age;
        }
        public int getAge()
        {
            return age;
        }
        
//       public Object clone(){
//           Object obj=null;
//           try{
//               obj= super.clone();
//           }
//           catch(CloneNotSupportedException ex){
//           }
//           return obj;
//       }
        
        public int compareTo(Object p){
            return this.name.compareTo(((Person)p).name);
        }
        
        
    }
   
