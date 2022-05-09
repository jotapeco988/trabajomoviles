package co.gprestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void mostarPersonas(List<Person> Person){
        for(int x=0;x<Person.size();x++) {
            System.out.println("Informacion de la persona " + x+1);
            System.out.println("Nombre:  " + Person.get(x).getName());
            System.out.println("identificacion: " + Person.get(x).getIndentification());
            System.out.println("edad: " + Person.get(x).getAge());

        }
    }
    public static void mostrarWatchmens(List<Watchman> Watchman){
        for(int x=0;x<Watchman.size();x++) {
            System.out.println("Informacion del WATCHMAN " + x+1);
            System.out.println(Watchman.get(x).getName());
            System.out.println(Watchman.get(x).getIndentification());
            System.out.println(Watchman.get(x).getAge());
            System.out.println(Watchman.get(x).getWeapon());
            System.out.println(Watchman.get(x).getWorkday());
        }
    }
    public static void mostrarAseo(List<CleaningStaff> CleaningStaff){
        for(int x=0;x<CleaningStaff.size();x++) {
            System.out.println("Informacion de ASEO" + x+1);
            System.out.println(CleaningStaff.get(x).getName());
            System.out.println(CleaningStaff.get(x).getIndentification());
            System.out.println(CleaningStaff.get(x).getAge());
            System.out.println(CleaningStaff.get(x).getDayOff());
        }
    }
    public static void mostrarAdministrador(List<Admin> Admin) {
        for (int x = 0; x < Admin.size(); x++) {
            System.out.println("Informacion de admin" + x + 1);
            System.out.println(Admin.get(x).getName());
            System.out.println(Admin.get(x).getIndentification());
            System.out.println(Admin.get(x).getAge());
            System.out.println(Admin.get(x).getLeader());
            System.out.println(Admin.get(x).getParking());
        }
    }
    public static void mostrarCuentas(List<AccountTant> AccountTant) {
        for (int x = 0; x < AccountTant.size(); x++) {
            System.out.println("Informacion de cuentas" + x + 1);
            System.out.println(AccountTant.get(x).getName());
            System.out.println(AccountTant.get(x).getIndentification());
            System.out.println(AccountTant.get(x).getAge());
            System.out.println(AccountTant.get(x).getLeader());
            System.out.println(AccountTant.get(x).getParking());
        }
    }
        public static void main(String[] args) {
            List<Person> personas = new ArrayList<>();
            List<Watchman> watchmens = new ArrayList<>();
            List<CleaningStaff> aseo = new ArrayList<>();
            List<Admin> administrador = new ArrayList<>();
            List<AccountTant> cuentas = new ArrayList<>();
            Scanner s = new Scanner(System.in);
            int opcion;
            boolean repetirGeneral = false;
            while (!repetirGeneral){
                System.out.println("Opciones: \n1.AÑADIR DATO \n2.MOSTRAR DATOS \n3.SALIR");
                int opcionMenuGeneral = s.nextInt();
                if(opcionMenuGeneral == 1){
                    boolean repetir = false;
                    System.out.println("Que dato desea ingresar: \n1.personas\n2.celador \n3.aseo \n4.admin \n5.Cuentas \n6.salir");
                    int addProduct = s.nextInt();
                    switch (addProduct){
                        case 1:
                            while(!repetir){
                                Person persons = new Person();
                                System.out.println("Ingrese El nombre: ");
                                persons.setName(s.next());
                                System.out.println("Ingrese la identificacion: ");
                                persons.setIndentification(s.next());
                                System.out.println("Ingrese la edad: ");
                                persons.setAge(s.nextInt());
                                personas.add(persons);
                                System.out.println("Digite 1 para añadir otra persona o 2 para salir");
                                opcion = s.nextInt();

                                if (opcion == 2) {
                                    repetir = true;
                                }
                            }
                            break;
                        case 2:
                            while(!repetir){
                                Watchman celador = new Watchman();
                                System.out.println("Ingresa el nombre: ");
                                celador.setName(s.next());
                                System.out.println("Ingrese la identificacion: ");
                                celador.setIndentification(s.next());
                                System.out.println("Ingrese la edad: ");
                                celador.setAge(s.nextInt());
                                System.out.println("Ingrese el weapon");
                                celador.setWeapon(s.next());
                                System.out.println("Ingrese el dia de trabajo: ");
                                celador.setWorkday(s.nextInt());
                                watchmens.add(celador);
                                System.out.println("Digite 1 para añadir otro celador o 2 para salir");
                                opcion = s.nextInt();
                                if (opcion == 2) {
                                    repetir = true;
                                }
                            }
                            break;

                        case 3:
                            while(!repetir){
                                CleaningStaff asear = new CleaningStaff();
                                System.out.println("Ingrese el nombre: ");
                                asear.setName(s.next());
                                System.out.println("Ingrese la identificacion: ");
                                asear.setIndentification(s.next());
                                System.out.println("Ingresa la edad: ");
                                asear.setAge(s.nextInt());
                                System.out.println("Ingrese el dia de descanso");
                                asear.setDayOff(s.next());
                                aseo.add(asear);
                                System.out.println("Digite 1 para añadir otra persona del aseo o 2 para salir");
                                opcion = s.nextInt();
                                if (opcion == 2) {
                                    repetir = true;
                                }
                            }
                            break;
                        case 4:
                            while(!repetir){
                                Admin admins = new Admin();
                                System.out.println("Ingresa el nombre: ");
                                admins.setName(s.next());
                                System.out.println("Ingrese la identificacion: ");
                                admins.setIndentification(s.next());
                                System.out.println("Ingrese la edad: ");
                                admins.setAge(s.nextInt());
                                System.out.println("Ingrese el leader");
                                admins.setLeader(s.next());
                                System.out.println("Ingrese el parking: ");
                                admins.setParking(s.next());
                                administrador.add(admins);
                                System.out.println("Digite 1 para añadir otro admin o 2 para salir");
                                opcion = s.nextInt();
                                if (opcion == 2) {
                                    repetir = true;
                                }
                            }
                        case 5:
                            while(!repetir){
                                AccountTant accounts = new AccountTant();
                                System.out.println("Ingresa el nombre: ");
                                accounts.setName(s.next());
                                System.out.println("Ingrese la identificacion: ");
                                accounts.setIndentification(s.next());
                                System.out.println("Ingrese la edad: ");
                                accounts.setAge(s.nextInt());
                                System.out.println("Ingrese el leader");
                                accounts.setLeader(s.next());
                                System.out.println("Ingrese el parking: ");
                                accounts.setParking(s.next());
                                cuentas.add(accounts);
                                System.out.println("Digite 1 para añadir otra cuenta o 2 para salir");
                                opcion = s.nextInt();
                                if (opcion == 2) {
                                    repetir = true;
                                }
                            }
                        case  6:
                            repetirGeneral = true;
                            break;


                        default:
                            System.out.println("Ingrese una opcion correcta");
                            break;
                    }

                }
                else if(opcionMenuGeneral == 2){
                    System.out.println("Que dato desea ver: \n 1.personas \n2. watchman \n3. aseo \n 4. admin \n5.cuentas");
                    int mostrar = s.nextInt();
                    switch (mostrar){
                        case 1:
                            mostarPersonas(personas);
                            break;
                        case 2:
                            mostrarWatchmens(watchmens);
                            break;
                        case 3:
                            mostrarAseo(aseo);
                            break;
                        case 4:
                            mostrarAdministrador(administrador);
                            break;
                        case 5:
                            mostrarCuentas(cuentas);

                    }
                }

                else if(opcionMenuGeneral== 3){
                    repetirGeneral = true;
                }

            }


        }
    }

