package wp1.z3;

public class EnchantedRoom extends Room
{
    protected Spell mSpell;

    public EnchantedRoom(EnchantedRoom other)
    {
        super(other);		
        mSpell = other.mSpell;
    }

    public EnchantedRoom(int roomNumber, Spell spell) 
    {
        super(roomNumber);		
        mSpell = spell;
    }

    public void init(int roomNumber, Spell spell)
    {
        super.init(roomNumber);		
        mSpell = spell;
    }

    @Override
    public Room clone() 
    {
        return new EnchantedRoom(this);
    }
}