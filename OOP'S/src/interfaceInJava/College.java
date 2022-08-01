package interfaceInJava;

public interface College {
void uniform();

void idCard();
void transport();
default void canteen()
{
	System.out.println("canteen not compulsory");
}

}
