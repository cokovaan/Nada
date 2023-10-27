class Animal {
    public void onomatopoeia() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void onomatopoeia() {
        System.out.println("Woof");
    }
}

class Lion extends Animal {
    @Override
    public void onomatopoeia() {
        System.out.println("Roar");
    }
}

class Frog extends Animal {
    @Override
    public void onomatopoeia() {
        System.out.println("Ribbit");
    }
}
