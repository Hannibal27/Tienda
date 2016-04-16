//Alumnos:
//Medina Mena Anibal
//Ortega Merida Juan Alberto
import java.util.Scanner;//utilizamos el Scanner para ingresar datos desde el teclado
public class Testtienda{
    public static void main(String[] args) {
        String n="s";
        String s="s";
        Producto leche= new Producto();// creamos nuestros objetos
        leche.setNombre("Leche");
        leche.setCantidad(0);
        leche.setPrecio(14);
        Producto frituras=new Producto();
        frituras.setNombre("Frituras");
        frituras.setCantidad(0);
        frituras.setPrecio(7);
        Producto chesco=new Producto();
        chesco.setNombre("Chesco");
        chesco.setCantidad(0);
        chesco.setPrecio(10);
        Producto chocolates=new Producto();
        chocolates.setNombre("Chocolates");
        chocolates.setCantidad(0);
        chocolates.setPrecio(5);
        Producto chela= new Producto();
        chela.setNombre("Chela");
        chela.setCantidad(0);
        chela.setPrecio(20);
        System.out.println("Bienvenido");
        while(n==s){
            System.out.println(" --------------------------------------------------------------------");
            System.out.println("|                         PRODUCTOS A LA VENTA                       |");
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println("|      Nombre                                 Precio                 |");
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println("|      1) Leche                                 $14                  |");
            System.out.println("|      2) Frituras                              $7                   |");
            System.out.println("|      3) Chesco                                $10                  |");
            System.out.println("|      4) Chocolates                            $5                   |");
            System.out.println("|      5) Chela                                 $20                  |");  
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println("|      6) Salir                                                      |"); 
            System.out.println("|____________________________________________________________________|"); 
            System.out.println("¿Que desea comprar?\nIngrese el numero de la opcion que desea comprar");                                                
            Scanner tecladoCom = new Scanner(System.in);
            int opr= tecladoCom.nextInt();
            switch(opr){
                case 1:
                    System.out.println("Producto:");
                    System.out.println(leche.getNombre());
                    System.out.println("Cantidad que desea comprar de este producto:");
                    Scanner cant1 = new Scanner(System.in);
                    int a= cant1.nextInt();
                    int unidades= leche.getCantidad(); //por si yA HABIAN ELEGIDO PREVIAMENTE EL PRODUCTO
                    leche.setCantidad(a+unidades);
                    break;
                case 2:
                    System.out.println("Producto:");
                    System.out.println(frituras.getNombre());
                    System.out.println("Cantidad que desea comprar de este producto:");
                    Scanner cant2 = new Scanner(System.in);
                    int b= cant2.nextInt();
                    int unidades2= frituras.getCantidad(); //por si yA HABIAN ELEGIDO PREVIAMENTE EL PRODUCTO
                    frituras.setCantidad(b+unidades2);
                    break;
                case 3:
                    System.out.println("Producto:");
                    System.out.println(chesco.getNombre());
                    System.out.println("Cantidad que desea comprar de este producto:");
                    Scanner cant3 = new Scanner(System.in);
                    int c= cant3.nextInt();
                    int unidades3= chesco.getCantidad(); //por si yA HABIAN ELEGIDO PREVIAMENTE EL PRODUCTO
                    chesco.setCantidad(c+unidades3);
                    break;
                case 4:
                    System.out.println("Producto:");
                    System.out.println(chocolates.getNombre());
                    System.out.println("Cantidad que desea comprar de este producto:");
                    Scanner cant4= new Scanner(System.in);
                    int d= cant4.nextInt();
                    int unidades4= chocolates.getCantidad(); //por si yA HABIAN ELEGIDO PREVIAMENTE EL PRODUCTO
                    chocolates.setCantidad(d+unidades4);
                    break;
                case 5:
                    System.out.println("Producto:");
                    System.out.println(chela.getNombre());
                    System.out.println("Cantidad que desea comprar de este producto:");
                    Scanner cant5 = new Scanner(System.in);
                    int e= cant5.nextInt();
                    int unidades5= chela.getCantidad(); //por si yA HABIAN ELEGIDO PREVIAMENTE EL PRODUCTO
                    chela.setCantidad(e+unidades5);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error no existe esta opcion");
            }
            if(opr!=6){
               System.out.println("¿Desea comprar otro producto?s/n");
               System.out.println("Ingrese s si desea continuar o n si desea terminar la operacion");
               Scanner p= new Scanner(System.in);
                String r= p.nextLine();
                if(r.equals(n)){
                    n="s";
                }
                else{
                    n="n";
                }
            }
            else{
                n="n";
            }
        }
        if(leche.getCantidad()==0 && frituras.getCantidad()==0 && chesco.getCantidad()==0 && chocolates.getCantidad()==0 && chela.getCantidad()==0){
            System.out.println("No has comprado nada\nGracias por su visita\nVuelva pronto");
        }
        else{
            if(leche.getCantidad()==0){
                leche.setNombre("-");
                leche.setPrecio(0);
            }
            if(frituras.getCantidad()==0){
                 frituras.setNombre("-");
                frituras.setPrecio(0);
            }
            if(chesco.getCantidad()==0){
                chesco.setNombre("-");
                chesco.setPrecio(0);
            }
            if(chocolates.getCantidad()==0){
                chocolates.setNombre("-");
                chocolates.setPrecio(0);
            }
            if(chela.getCantidad()==0){
                chela.setNombre("-");
                chela.setPrecio(0);
            }
           System.out.println(" -------------------------------------------------------------------");
           System.out.println("|                             TICKET                                |");
           System.out.println(" -------------------------------------------------------------------");
           System.out.println("|Producto       precio         cantidad            Total individual |");
           System.out.println(" -------------------------------------------------------------------");
           System.out.println(leche.getNombre()+"\t\t"+"$"+leche.getPrecio()+"\t\t"+leche.getCantidad()+"\t\t"+"$"+(leche.getPrecio()*leche.getCantidad()));
           System.out.println(frituras.getNombre()+"\t\t"+"$"+frituras.getPrecio()+"\t\t"+frituras.getCantidad()+"\t\t"+"$"+(frituras.getPrecio()*frituras.getCantidad()));
           System.out.println(chesco.getNombre()+"\t\t"+"$"+chesco.getPrecio()+"\t\t"+chesco.getCantidad()+"\t\t"+"$"+(chesco.getPrecio()*chesco.getCantidad()));
           System.out.println(chocolates.getNombre()+"\t\t"+"$"+chocolates.getPrecio()+"\t\t"+chocolates.getCantidad()+"\t\t"+"$"+(chocolates.getPrecio()*chocolates.getCantidad()));
           System.out.println(chela.getNombre()+"\t\t"+"$"+chela.getPrecio()+"\t\t"+chela.getCantidad()+"\t\t"+"$"+(chela.getPrecio()*chela.getCantidad()));
           System.out.println("|-------------------------------------------------------------------");
           System.out.println("| TOTAL:|"+"\t"+"$"+((leche.getPrecio()*leche.getCantidad())+(frituras.getPrecio()*frituras.getCantidad())+(chesco.getPrecio()*chesco.getCantidad())+(chocolates.getPrecio()*chocolates.getCantidad())+(chela.getPrecio()*chela.getCantidad()))+"\t"+"|");
           System.out.println(" -------------------------------------------------------------------");
        }

    }
}