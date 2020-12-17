package net.sourceforge.plantuml.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.graphics.ImageData;

import net.sourceforge.plantuml.eclipse.utils.LinkData;

public class DiagramImageData {

	private final DiagramData diagram;
	private final int imageNum;
	private ImageData imageData;

	private final Collection<LinkData> links = new ArrayList<LinkData>();

	public DiagramImageData(final DiagramData diagram, final int imageNum, final ImageData imageData) {
		super();
		this.diagram = diagram;
		this.imageNum = imageNum;
		this.imageData = imageData;
	}

	public DiagramImageData(final DiagramData diagram, final ImageData imageData) {
		this(diagram, 0, imageData);
	}

	public DiagramImageData(final DiagramData diagram, final int imageNum) {
		this(diagram, imageNum, null);
	}

	public DiagramImageData(final DiagramData diagram) {
		this(diagram, 0);
	}

	public DiagramImageData withImageNum(final int imageNum) {
		return new DiagramImageData(diagram, imageNum);
	}

	public DiagramData getDiagram() {
		return diagram;
	}

	public IPath getSourcePath() {
		return diagram.getOriginal();
	}

	public int getImageNum() {
		return imageNum;
	}

	public ImageData getImage() {
		if (imageData == null) {
			imageData = diagram.getImage(imageNum, links);
		}
		return imageData;
	}

	public Iterable<LinkData> getLinks() {
		return links;
	}
}
