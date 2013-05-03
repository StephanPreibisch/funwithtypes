package test;

import net.imglib3.type.try4.ByteReadable;
import net.imglib3.type.try4.Double;
import net.imglib3.type.try4.DoubleReadable;
import net.imglib3.type.try4.Int;
import net.imglib3.type.try4.Byte;
import net.imglib3.type.try4.IntReadable;
import net.imglib3.type.try4.IntWritable;
import net.imglib3.type.try4.Writable;
import net.imglib3.type.try4.ByteType;
import net.imglib3.type.try4.DoubleType;
import net.imglib3.type.try4.IntType;
import net.imglib3.type.try4.Readable;

/**
 * Test for net.imglib3.type.try4
 * 
 * @author preibischs
 *
 */
public class Test4 
{
	public static void main( String[] args )
	{
		DoubleReadable< Double > d = null;
		DoubleReadable< Int > di = null;
		DoubleReadable< Byte > db = null;
		IntReadable< Int > i = null;		
		IntReadable< Byte > ib = null;
		ByteReadable< Byte > b = null;
		
		d.get().getDouble();
		i.get().getDouble();
		i.get().getInt();
		Int j = di.get();
		
	}
	
}
