/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;

/**
 *
 * @author Desenvolvimento
 */
public class Mock {

   private static ArrayList<Produto> lista;

   public static void makeMock(){

      if(lista == null){
         lista = Produto.getLista();

         Produto caneta = new Produto();
         caneta.setDescricao("Caneta Bic");
         caneta.setPreco(1.5f);
         caneta.setOferta(true);
         lista.add(caneta);

         Produto caderno = new Produto();
         caderno.setDescricao("Caderno Tlibra");
         caderno.setPreco(5.5f);
         caderno.setOferta(true);
         lista.add(caderno);

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
         apontador.setOferta(true);
         lista.add(apontador);

         Produto pendrive = new Produto();
         pendrive.setDescricao("pendrive");
         pendrive.setPreco(2.5f);
         pendrive.setOferta(true);
         lista.add(pendrive);

         Produto picanha = new Produto();
         picanha.setDescricao("picanha");
         picanha.setPreco(100.0f);
         picanha.setOferta(true);
         lista.add(picanha);

         Produto Joãovitor = new Produto();
         Joãovitor.setDescricao("joaovitor");
         Joãovitor.setPreco(0.1f);
         Joãovitor.setOferta(true);
         lista.add(Joãovitor);
      }

   }

}
