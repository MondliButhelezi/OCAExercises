package chapterOne.access_modifiers;

class Zoos {
    public String coolMethod() {
        return "Wow baby";
    }
}

class Moos extends Zoos {

    public void useZoo() {
        System.out.println("Moo says, " + this.coolMethod());

        Zoos z = new Zoos();

        System.out.println("Zoo says, " + z.coolMethod());
//        The preceding line works because Moo can access the public method
    }
}
