package db;

import java.util.ArrayList;
import modelos.Produto;
import modelos.Usuario;

public class Mock {


   public static void makeMock(){
      createUsers();
      createProducts();

   }

   private static void createUsers(){
      ArrayList<Usuario> lista;

      if(Usuario.getLista() .isEmpty()){
         lista = Usuario.getLista();

         Usuario admin = new Usuario();
         admin.setEmail("admin@ifpr.edu.br");
         admin.setSenha("admin");
         admin.setNome("Administrador");
         lista.add(admin);

         Usuario gerente = new Usuario();
         gerente.setEmail("gerente@ifpr.edu.br");
         gerente.setSenha("123");
         gerente.setNome("Fulano de Tal");
         lista.add(gerente);

      }
   }
   private static void createProducts(){
         ArrayList<Produto> lista;

      if(Produto.getLista() .isEmpty()){
         lista = Produto.getLista();

         Produto caneca = new Produto();
         caneca.setDescricao("Caneca");
         caneca.setPreco(10.0f);
         caneca.setOferta(true);
         lista.add(caneca);

         Produto lapis = new Produto();
         lapis.setDescricao("Lapis");
         lapis.setPreco(1.0f);
         lapis.setOferta(true);
         lista.add(lapis);

         Produto borracha = new Produto();
         borracha.setDescricao("Borracha");
         borracha.setPreco(2.0f);
         borracha.setOferta(true);
         lista.add(borracha);

         Produto apontador = new Produto();
         apontador.setDescricao("Apontador");
         apontador.setPreco(2.5f);
         apontador.setOferta(false);
         lista.add(apontador);

         Produto pendrive = new Produto();
         pendrive.setDescricao("pendrive");
         pendrive.setPreco(2.5f);
         pendrive.setOferta(false);
         lista.add(pendrive);

         Produto picanha = new Produto();
         picanha.setDescricao("picanha");
         picanha.setPreco(100.0f);
         picanha.setOferta(false);
         lista.add(picanha);

         Produto Joãovitor = new Produto();
         Joãovitor.setDescricao("joaovitor");
         Joãovitor.setPreco(0.1f);
         Joãovitor.setOferta(false);
         lista.add(Joãovitor);
      }

   }

}
