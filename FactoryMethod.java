    class Employee{
        String empName="Javed Iqbal";
    }

    class ITCompany{
        private ITCompany(){

        }
        String itcCompany=" jd technology";

        public static ITCompany getObjectFotITCompany(){
            return new ITCompany();
        }
        Employee getObjEmployee(){
            return  new Employee();
        }

    }

public class FactoryMethod{
        public static  void main(String[] args){
        Circle cr= new Circle(2.5);

        ITCompany itc =  ITCompany.getObjectFotITCompany();
        System.out.println(itc.itcCompany);
        Employee e =itc.getObjEmployee();
        System.out.println(e.empName);



    }
}
