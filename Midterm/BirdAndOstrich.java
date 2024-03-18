
class Bird {
    void sing() {
        System.out.println("This bird can sing.");
    }
}


class BirdThatFlies extends Bird
{
    void fly() {
        System.out.println("This bird can fly.");
    }
}

class Ostrich extends Bird {
    // // Ostriches cannot fly
    // @Override
    // void fly() {
    //     throw new UnsupportedOperationException("Ostriches cannot fly.");
    // }
}
