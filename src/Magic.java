public class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        setTypeOfSuperAbility("Ice Stone");
        System.out.println("Magic применил суперспособность " + getTypeOfSuperAbility());
    }
}
