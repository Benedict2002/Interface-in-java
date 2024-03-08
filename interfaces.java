interface A {
    void Adisplay();
    void Ashow();
}

interface B {
    void Bdisplay();
    void Bshow();
}

class AB implements A, B {
    public void Adisplay() {
        System.out.println("A display");
    }

    public void Ashow() {
        System.out.println("A show");
    }

    public void Bdisplay() {
        System.out.println("B display");
    }

    public void Bshow() {
        System.out.println("B show");
    }
}



