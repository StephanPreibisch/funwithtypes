package net.imglib3.type.try2;

public interface DoubleReadable< R extends DoubleReadable< R > > extends Readable< R > 
{
	double getDouble();
}
