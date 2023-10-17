package controller.sort;

import fateczl.Lista.model.Lista;

public class SortList {
    public SortList() {
        super();
    }
    public Lista<Integer> IntSort(Lista<Integer> lista) throws Exception{
        for(int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                int a = lista.get(j);
                int b = lista.get(j+1);
                if (a > b) {
                    lista.remove(j);
                    lista.remove(j);
                    lista.add(a,j);
                    lista.add(b,j);
                }
            }
        }
        return lista;
    }

    public Lista<Long> LongSort(Lista<Long> lista) throws Exception{
        for(int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                long a = lista.get(j);
                long b = lista.get(j+1);
                if (a > b) {
                    lista.remove(j);
                    lista.remove(j);
                    lista.add(a,j);
                    lista.add(b,j);
                }
            }
        }
        return lista;
    }

    public Lista<Double> DoubleSort(Lista<Double> lista) throws Exception{
        for(int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                double a = lista.get(j);
                double b = lista.get(j+1);
                if (a > b) {
                    lista.remove(j);
                    lista.remove(j);
                    lista.add(a,j);
                    lista.add(b,j);
                }
            }
        }
        return lista;
    }

    public Lista<Float> FloatSort(Lista<Float> lista) throws Exception{
        for(int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                float a = lista.get(j);
                float b = lista.get(j+1);
                if (a > b) {
                    lista.remove(j);
                    lista.remove(j);
                    lista.add(a,j);
                    lista.add(b,j);
                }
            }
        }
        return lista;
    }
}
