package graphics;

import java.awt.Graphics;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/**
 * Collection of IGraphics, also implements IGraphics
 * @author smk9
 *
 */
public class GraphicsCollection implements Collection<IGraphics>, IGraphics {

	private Vector<IGraphics> graphics;
	
	public GraphicsCollection() {
		graphics = new Vector<IGraphics>();
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return graphics.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return graphics.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return graphics.contains(o);
	}

	@Override
	public Iterator<IGraphics> iterator() {
		// TODO Auto-generated method stub
		return graphics.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return graphics.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return graphics.toArray(a);
	}

	@Override
	public boolean add(IGraphics e) {
		// TODO Auto-generated method stub
		return graphics.add(e);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return graphics.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return graphics.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends IGraphics> c) {
		// TODO Auto-generated method stub
		return graphics.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return graphics.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return graphics.retainAll(c);
	}

	@Override
	public void clear() {
		graphics.clear();
	}

	@Override
	public void draw(Graphics g) {
		for (IGraphics img : graphics) {
			System.out.println("This is a graphic: " + img);
			if(img != null) {
				img.draw(g);
			}
		}
		
	}

}
