package service;

import java.util.List;

import dao.ImageDAOImpl;
import domain.ImageDTO;
import proxy.Proxy;

public class ImageServiceImpl implements ImageService{

	private static ImageServiceImpl instance = new ImageServiceImpl();
	private ImageServiceImpl() {
		dao = ImageDAOImpl.getInstance();
	}
	public static ImageServiceImpl getInstance() {return instance;}
	ImageDAOImpl dao;
	@Override
	public void addImage(ImageDTO img) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ImageDTO> imageList(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageDTO> searchImage(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageDTO retrieveImage(ImageDTO img) {
		// TODO Auto-generated method stub
		return null;
	}

}
