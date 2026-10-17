package homework_1.task_6;

class PenguinOld extends BirdOld {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвины не летают");
    }
}
