package java.org.example;

import ru.vsu.cs.uliyanov.Table;
import ru.vsu.cs.uliyanov.TableRow;

public class Main {
    public static void main(String[] args) throws TableRow.TableRowException {
        Table<Integer> table = getTable();
        print(table);
        table.addColumn(getRow());
        print(table);
    }

    public static void print(Table<Integer> table) throws TableRow.TableRowException {
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColCount(); j++) {
                System.out.print(table.get(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static TableRow<Integer> getRow() {
        TableRow<Integer> row = new TableRow<>();
        for (int i = 0; i < 5; i++) {
            row.addLast(i);
        }
        return row;
    }

    public static Table<Integer> getTable() {
        Table<Integer> table = new Table<>();
        for (int i = 0; i < 5; i++) {
            table.addColumn(getRow());
        }
        return table;
    }
}
