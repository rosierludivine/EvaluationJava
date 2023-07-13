import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //donner brut
        Client client1 = new Client(1234);
        Compte compte1 = new Compte(client1.idCompte, 1000);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre identifiant:\nVous avez 2 tentatives  ");
        // La valeur entrer par l'utilisateur est dans la variable idCompte
        int idCompteInput = scanner.nextInt();


        //Tant que id n'est pas bon
        if (idCompteInput != client1.idCompte) {
            System.out.println("Veuillez re essayer \nil comporte 9 chiffre");
            idCompteInput = scanner.nextInt();
            client1.setIdCompte(idCompteInput);
        }else{
        System.out.println("Code bon \nChargement en cours ");
        }

        // Fin de la connection
        //Debut du menu
        System.out.println("1- Regarder votre Solde\n2- Faire un virement\n3- Retirer\n4- Ajouter de l'argent\n5- Modification du compte\n6- Informations du compte \n7-Quitter  ");
        System.out.println("Ecrivez le numero du menu choissi ");



        int menu = scanner.nextInt();
        while (menu != 7 ){
                switch (menu){
                    case 1:
                        //Permet dafficher le Solde du compte
                        System.out.println(compte1.getSolde());
                        break;
                    case 2:
                        //Permettre de faire un virement
                        // Amelioration ( faire avec des doubles )
                        System.out.println("Ecrivez les virements, ne contiennent pas de centime ");
                        int montant = scanner.nextInt();
                        System.out.println("A qui voulez vous faire le virement ? ");
                        String personne = scanner.next();
                        compte1.setVirement(montant, personne);
                        System.out.println(compte1.getVirement());
                        break;
                    case 3:
                        //Retirer de l'argent du distributeur
                        System.out.println("Ecrivez les virements,le distributeur ne permet pas de vous donner des centimes ");
                        int retrait = scanner.nextInt();
                        compte1.setRetrait(retrait);
                        System.out.println(compte1.getRetrait());
                        break;
                    case 4:
                        //Ajouter de l'argent
                        System.out.println("Ecrivez les virements,le distributeur ne permet pas de vous donner des centimes ");
                        int encaisser = scanner.nextInt();
                        compte1.setEncaisser(encaisser);
                        System.out.println(compte1.getEncaisser());
                        break;
                    case 5:
                        //Modifier les information du compte
                        System.out.println("Veuillez ecrire le numéro qui correspond au champs à modifier");
                        System.out.println("1- Modifier votre Nom \n2- Modifier le Prenom \n3- Modifier la ville \n4- Modifier le Code Postal\n5- Modification le numéro de téléphone\n 6-Menu Principal  ");
                        int modification = scanner.nextInt();
                        while (modification != 6 ) {

                            switch (modification) {
                                case 1:
                                    System.out.println("Quelle est le Nom");
                                    String nom = scanner.next();
                                    client1.setName(nom);
                                    System.out.println(client1.getName());
                                    break;
                                case 2:
                                    System.out.println("Quelle est la Prenom");
                                    String prenom = scanner.next();
                                    client1.setPrenom(prenom);
                                    System.out.println(client1.getPrenom());
                                    break;
                                case 3:
                                    System.out.println("Quelle est votre nouvelle ville ");
                                    String ville = scanner.next();
                                    System.out.println(client1.getVille());
                                    break;
                                case 4:
                                    System.out.println("Quelle est votre nouveaux code postale ");
                                    int cp = scanner.nextInt();
                                    client1.setCodePostal(cp);
                                    System.out.println(client1.getCodePostal());
                                    break;
                                case 5:
                                    System.out.println("Quelle est votre nouveaux numérro de téléphone ");
                                    int nTelephone = scanner.nextInt();
                                    client1.setnTelephone(nTelephone);
                                    System.out.println(client1.getnTelephone());
                                    break;
                            }
                            System.out.println("1- Modifier votre Nom \n2- Modifier le Prenom \n3- Modifier la ville \n4- Modifier le Code Postal\n5- Modification le numéro de téléphone\n 6-Menu Principal  ");
                            modification = scanner.nextInt();
                        }
                        //modification = scanner.nextInt();
                        System.out.println("1- Regarder votre Solde\n2- Faire un virement\n3- Retirer\n4- Ajouter de l'argent\n5- Modification du compte\n6- Informations du compte \n7-Quitter  ");

                        break;
                    case 6:
                        //Affichage des données comptes
                        System.out.println("Votre numero de compte: "+compte1.getIdCompte());
                        System.out.println("Votre prenom "+ compte1.getPrenom());
                        System.out.println("Votre Nom: "+compte1.getName());
                        System.out.println("Votre ville: "+compte1.getVille());
                        System.out.println("Votre Code Postal: " +compte1.getCodePostal());
                        System.out.println("Votre numéro telephone: "+compte1.getnTelephone());
                        break;
                }

            //test du bon fonctionnement de ma boucle
            System.out.println("Ecrivez le numero du menu choissi ");
            menu = scanner.nextInt();

        }
        System.out.println("Au revoir, au plaisir de vous revoir ");


    }

}