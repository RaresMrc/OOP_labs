public class Main {
    public static void main(String[] args) {
        final int maxNrOfItems = 10;
        Ghiozdan ghiozdan = new Ghiozdan(maxNrOfItems);

        Caiet caiet1 = new Caiet();
        Manual manual1 = new Manual();

        ghiozdan.add(caiet1);
        ghiozdan.add(manual1);

        ghiozdan.listItems();
        ghiozdan.listNotebooks();
        ghiozdan.listManuals();
        System.out.println(ghiozdan.getCurrentItems());
        System.out.println(ghiozdan.getNrOfManuals());
        System.out.println(ghiozdan.getNrOfNotebooks());
    }
}