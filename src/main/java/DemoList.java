import java.util.ArrayList;

 class DemoList {

    ArrayList<Integer> list = new ArrayList();

    public void addElement(int val) {
        list.add(val);
    }
    public int printByPos(int pos) {
        return list.get(pos);
    }
    public int getPos(int value) {
        return list.indexOf(value);
    }
    public void remove(int pos) {
        list.remove(list.get(pos));
    }
   public void removeFromLast() {
        list.remove(list.get(list.size()-1));
    }
    public void removeFromFirst() {
        list.remove(list.get(0));
    }
    public void printAll() {
        System.out.print(list);
        System.out.println();
    }

}
