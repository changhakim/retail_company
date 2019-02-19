package dao;

import java.util.List;

import domain.ImageDTO;
import proxy.Proxy;

public interface ImageDAO {

	public void insertImage(ImageDTO img);
	public List<ImageDTO> selectimageList(Proxy pxy);
	public List<ImageDTO> selectImage(Proxy pxy);
	public ImageDTO lastImageSeq();
	public ImageDTO selectImage(ImageDTO img);
}
