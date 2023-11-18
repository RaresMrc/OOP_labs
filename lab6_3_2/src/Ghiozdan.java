public class Ghiozdan {
    Rechizita[] rechizite;
    int currentItems = 0;
    Ghiozdan(int maxNumberOfItems) {
        this.rechizite = new Rechizita[maxNumberOfItems];
    }
    public void add(Caiet notebook) {
        // if there's no more space, return
        if (this.currentItems >= this.rechizite.length) return;
        // add the new item
        this.rechizite[this.currentItems] = notebook;
        // increment the current items counter
        this.currentItems++;
    }

    public void add(Manual manual) {
        // if there's no more space, return
        if (this.currentItems >= this.rechizite.length) return;
        // add the new item
        this.rechizite[this.currentItems] = manual;
        // increment the current items counter
        this.currentItems++;
    }

    public void listItems() {
        for (int i = 0; i < this.rechizite.length; i++) {
            if (this.rechizite[i] == null) continue;
            System.out.println(this.rechizite[i].toString());
        }
    }

    public void listManuals() {
        for (Rechizita rechizita: this.rechizite) {
            if (rechizita != null && rechizita.getClass() == Manual.class) {
                System.out.println(rechizita.toString());
            }
        }
    }

    public void listNotebooks() {
        for (Rechizita rechizita: this.rechizite) {
            if (rechizita != null && rechizita.getClass() == Caiet.class) {
                System.out.println(rechizita.toString());
            }
        }
    }

    public int getCurrentItems() {
        return this.currentItems;
    }

    public int getNrOfManuals() {
        int nrOfManuals = 0;
        for (Rechizita rechizita: this.rechizite) {
            if (rechizita != null && rechizita.getClass() == Manual.class) {
                nrOfManuals++;
            }
        }
        return nrOfManuals;
    }

    public int getNrOfNotebooks() {
        int nrOfNotebooks = 0;
        for (Rechizita rechizita: this.rechizite) {
            if (rechizita != null && rechizita.getClass() == Caiet.class) {
                nrOfNotebooks++;
            }
        }
        return nrOfNotebooks;
    }
}
