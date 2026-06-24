package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AutorTableModel extends AbstractTableModel {

    private ArrayList<Autor> lista = new ArrayList<>();

    String colunas[] = {
            "Nome", "CPF", "Email", "Gênero", "Nacionalidade"
    };

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }

    @Override
    public Object getValueAt(int row, int col) {

        Autor a = lista.get(row);

        return switch (col) {
            case 0 -> a.getNome();
            case 1 -> a.getCpf();
            case 2 -> a.getEmail();
            case 3 -> a.getGenero();
            case 4 -> a.getNacionalidade();
            default -> null;
        };
    }

    public void adicionar(Autor a) {
        lista.add(a);
        fireTableDataChanged();
    }

    public void remover(int i) {
        lista.remove(i);
        fireTableDataChanged();
    }

    public Autor getAutor(int i) {
        return lista.get(i);
    }

    public void atualizar(int i, Autor a) {
        lista.set(i, a);
        fireTableRowsUpdated(i, i);
    }
}