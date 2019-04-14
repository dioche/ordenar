
package aplicativoOrdenacao;


public class QuickSort {
  public static void quickSort(int[]v, int inic, int fim ){
        int meio;
        
        if(inic < fim){
            meio = partition(v, inic, fim);
            quickSort(v, inic, meio);
            quickSort(v, meio+1, fim);
        }
        
    } //Fim do método QuickSort
    
    
    public static int partition(int[]v, int inic, int fim){
        int pivo, topo, i;
        pivo = v[inic];
        topo = inic;
        
        for(i = inic+1; i < fim;i++){
            if(v[i] < pivo){
                v[topo] = v[i];
                v[i] = v[topo+1];
                topo++;
            }
        }
        v[topo]= pivo;
        return topo;   
}
}