package com.CMSL.x00091119;


import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();
        int op;
        int op2;
        int op3;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal()));

            switch (op) {

                case 1:
                    op2 = Integer.parseInt(JOptionPane.showInputDialog(null, menuDos()));

                    String name = JOptionPane.showInputDialog(null, "Escriba el nombre de su Item: ");
                    int weight = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                            "el peso de su Item: "));
                    String description = JOptionPane.showInputDialog(null, "Coloque la" +
                            " descripcion de su Item: ");
                    if (op2 == 1) {

                        int reuseTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "el tiempo de reutilización: "));
                        String level = JOptionPane.showInputDialog(null, "Coloque el" +
                                " nivel: ");
                        String type = JOptionPane.showInputDialog(null, "Coloque el" +
                                " tipo: ");
                        int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "cantidad: "));
                        PersonalItems.add(new Potion(name, weight, description, reuseTime, level, type, amount));

                    } else if (op2 == 2) {

                        int reuseTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "el tiempo de reutilización: "));
                        String level = JOptionPane.showInputDialog(null, "Coloque " +
                                " el nivel: ");
                        String type = JOptionPane.showInputDialog(null, "Coloque el" +
                                " tipo: ");
                        int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "cantidad: "));
                        int time = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "Tiempo: "));
                        PersonalItems.add(new Elixir(name, weight, description, reuseTime, level, type, amount, time));

                    } else if (op2 == 3) {
                        /*
                        int remainingUses = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "ReuseTime: "));
                        boolean equipped = // no se como rayos colocar un boolean en JOPane jaja.perdon
                        PersonalItems.add(new Elixir(name, weight, description, remainingUses, equipped));
                        /*
                         */

                    } else{
                        int remainingUses = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "usos restantes: "));
                        String type = JOptionPane.showInputDialog(null, "Coloque la" +
                                " tipo: ");
                        double speed = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "velocidad: "));
                        double damage = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "el tiempo de reutilización: "));
                        String wieldType = JOptionPane.showInputDialog(null, "Coloque la" +
                                " nivel: ");
                        int level = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque " +
                                "cantidad: "));

                        PersonalItems.add(new Weapon(remainingUses, type, speed, damage, wieldType, level));

                    }
                    break;
                case 2:
                    int compartirID = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite el numero de ID que desea compartir:"));

                    PersonalItems.forEach(b ->{
                            if (b.getID() == compartirID)
                        CommonItems.add(b);
                         });

                    JOptionPane.showMessageDialog(null, "Excelente, se compartió tu item con exito!");

                    break;

                case 3:
                    String listaS = JOptionPane.showInputDialog(null,
                            "Digite  el nombre de la lista en la que desea buscar su item (PersonalItems o CommonItems: ");
                    int buscarD = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite su ID: "));
                    if (listaS.equalsIgnoreCase("PersonalItems")) {
                        for (Item b : PersonalItems) {
                            if (b.getID() == buscarD)
                                JOptionPane.showMessageDialog(null, b.toString());

                        }
                    } else
                        for (Item b : CommonItems) {
                            if (b.getID() == buscarD)
                                JOptionPane.showMessageDialog(null, b.toString());

                        }
                        break;

                case 4:
                    op3 = Integer.parseInt(JOptionPane.showInputDialog(null, menuTres()));
                    JOptionPane.showMessageDialog(null, "---Items que puedes elegir " +
                            "para buscar---\n---'Potion', 'Elixir', 'Ammo' y 'Weapon'--- ");
                    String item3 = JOptionPane.showInputDialog(null, "Escriba el nombre de su Item: ");
                    if (op3 == 1) {
                        if (item3.equalsIgnoreCase("Potion"))
                            PersonalItems.forEach(b -> {
                                if (b instanceof Potion)
                                    JOptionPane.showMessageDialog(null, "Su lsiat de tems es: " + b.toString());
                            });
                        else if (item3.equalsIgnoreCase("Elixir"))
                            PersonalItems.forEach(b -> {
                                if (b instanceof Elixir)
                                    JOptionPane.showMessageDialog(null, "Su lsiat de tems es: " + b.toString());
                            });
                        else if (item3.equalsIgnoreCase("Ammo"))
                            PersonalItems.forEach(b -> {
                                if (b instanceof Ammo)
                                    JOptionPane.showMessageDialog(null, "Su lsiat de tems es: " + b.toString());
                            });
                        else if (item3.equalsIgnoreCase("Weapon"))
                            PersonalItems.forEach(b -> {
                                if (b instanceof Weapon)
                                    JOptionPane.showMessageDialog(null, "Su lsiat de tems es: " + b.toString());
                            });

                    } else {
                        if (item3.equalsIgnoreCase("Potion"))
                            CommonItems.forEach(b -> {
                                if (b instanceof Potion)
                                    JOptionPane.showMessageDialog(null, "Su lsiat de tems es: " + b.toString());
                            });
                        else if (item3.equalsIgnoreCase("Elixir"))
                            CommonItems.forEach(b -> {
                                if (b instanceof Elixir)
                                    JOptionPane.showMessageDialog(null, "Su lsiat de tems es: " + b.toString());
                            });
                        else if (item3.equalsIgnoreCase("Ammo"))
                            CommonItems.forEach(b -> {
                                if (b instanceof Ammo)
                                    JOptionPane.showMessageDialog(null, "Su lsiat de tems es: " + b.toString());
                            });
                        else CommonItems.forEach(b -> {
                                if (b instanceof Weapon)
                                    JOptionPane.showMessageDialog(null, "Su lsiat de tems es: " + b.toString());
                            });
                    }
                    break;
                case 5: {
                    String lista= JOptionPane.showInputDialog(null,
                            "Digite  el nombre de la lista en la que desea eliminar su item (PersonalItems o CommonItems: ");
                    int buscar = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite su ID: "));
                    if (lista.equalsIgnoreCase("PersonalItems")) {
                        PersonalItems.removeIf(a -> {
                            if (a.getID() == buscar) {
                                JOptionPane.showMessageDialog(null, "---Se ha eliminado con exito--- ");
                                return true;
                            } else {
                                return false;
                            }
                        });

                    } else {
                        CommonItems.removeIf(a -> {
                            if (a.getID() == buscar) {
                                JOptionPane.showMessageDialog(null, "---Se ha eliminado con exito--- ");
                                return true;
                            } else {
                                return false;
                            }
                        });


                    }
                }
                break;
                case 6:

                    op2 = Integer.parseInt(JOptionPane.showInputDialog(null, menuDos()));
                    if (op2 == 1) {
                        op3 = Integer.parseInt(JOptionPane.showInputDialog(null, menuTres()));
                        switch (op3) {
                            case 1:
                                PotionF(PersonalItems);
                                break;
                            case 2:
                                ElixirF(PersonalItems);
                                break;
                            case 3:
                                AmmoF(PersonalItems);
                                break;
                            case 4:
                                WeaponF(PersonalItems);
                                break;
                        }
                        break;

                    } else if (op2 == 2) {
                        op3 = Integer.parseInt(JOptionPane.showInputDialog(null, menuTres()));
                        switch (op3) {
                            case 1:
                                PotionF(CommonItems);
                                break;
                            case 2:
                                ElixirF(CommonItems);
                                break;
                            case 3:
                                AmmoF(CommonItems);
                                break;
                            case 4:
                                WeaponF(CommonItems);
                                JOptionPane.showMessageDialog(null, "");
                                break;
                        }

                        break;
                    }
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo . . .");
                    break;
            }
           } while(op !=0);
        }



        static void PotionF(ArrayList<Item> a){
            a.removeIf(b -> (b instanceof Potion));
            }

    static void AmmoF(ArrayList<Item> a){
        a.removeIf(b -> (b instanceof Ammo));
    }
    static void ElixirF(ArrayList<Item> a){
        a.removeIf(b -> (b instanceof Elixir));
    }
    static void WeaponF(ArrayList<Item> a){
        a.removeIf(b -> (b instanceof Weapon));
    }

    static String menuPrincipal() {
        return "1. Agregar item \n2. Compartir item \n3. Buscar item por ID \n4. Buscar item por tipo " +
                "\n5. Borrar item por ID \n6. Borrar item por tipo \n 0. Salir";
    }

    static String menuDos(){
        return "---Items que puedes elegir---\n1. Potion \n2. Elixir \n3. Ammo \n4. Weapon";
    }
    static String menuTres(){
        return "---Lista que puedes elegir---\n 1.PersonalItems \n2.CommonItems";
    }
}

