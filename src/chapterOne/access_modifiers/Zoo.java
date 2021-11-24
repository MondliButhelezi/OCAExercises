package chapterOne.access_modifiers;

class Zoo {
    public String coolMethod() {
        return "Wow baby";
    }
}

class Moo {

    public void useZoo() {
        Zoo z = new Zoo();
//        if the preceding line compiles Moo has access to the zoo class
//        But... does it have access to the coolMethod()?
        System.out.println("A Zoo says, " + z.coolMethod());
//        The preceding line works because Moo can access the public method
    }
}
