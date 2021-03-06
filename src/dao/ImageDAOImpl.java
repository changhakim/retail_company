package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import domain.ImageDTO;
import enums.ImageSQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.Proxy;

public class ImageDAOImpl implements ImageDAO{
	private static ImageDAOImpl instance = new ImageDAOImpl();
	private ImageDAOImpl() {}
	public static ImageDAOImpl getInstance() {return instance;}

	@Override
	public void insertImage(ImageDTO img) {
		try {
			String sql = ImageSQL.IMG_INSERT.toString();
		PreparedStatement ps = 	DatabaseFactory
								.createDatabase(Vendor.ORACLE)
								.getConnection()
								.prepareStatement(sql);
			ps.setString(1, img.getImgName());
			ps.setString(2, img.getImgExtention());
			ps.setString(3, img.getOwner());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ImageDTO> selectimageList(Proxy pxy) {
		try {
			String sql = "";
			PreparedStatement ps = DatabaseFactory
							.createDatabase(Vendor.ORACLE)
							.getConnection()
							.prepareStatement(sql);
			ps.setString(1, "");
			ps.setString(2, "");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ImageDTO> selectImage(Proxy pxy) {
		
		try {
			String sql = "";
			PreparedStatement ps = DatabaseFactory
									.createDatabase(Vendor.ORACLE)
									.getConnection()
									.prepareStatement(sql);
			ps.setString(1,"");
		 ResultSet rs = ps.executeQuery();
		 while(rs.next()) {
			 
		 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ImageDTO selectImage(ImageDTO img) {
		ImageDTO img1 = null;
		System.out.println("디티오이미지시퀀스"+img.getImgSeq());
		try {
			String sql = ImageSQL.IMG_LAST_RETRIEVE.toString();
			PreparedStatement ps =  DatabaseFactory
							.createDatabase(Vendor.ORACLE)
							.getConnection()
							.prepareStatement(sql);
			ps.setString(1, img.getImgSeq());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			img1 = new ImageDTO();
			img1.setImgExtention(rs.getString("IMG_EXTENTION"));
			img1.setImgName(rs.getString("IMG_NAME"));
			img1.setOwner(rs.getString("OWNER"));
			}
			System.out.println("이미지DAO이미지이름"+img1.getImgName());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("이미지DAO이미지이름"+img1.getImgName());
		return img1;
	}
	@Override
	public ImageDTO lastImageSeq() {
		ImageDTO img = null;
		try {
			String sql = ImageSQL.IMG_LAST_SEQ.toString();
			
			PreparedStatement ps = DatabaseFactory
								   .createDatabase(Vendor.ORACLE)
									.getConnection()
									.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				img = new ImageDTO();
				img.setImgSeq(rs.getString("LAST"));
				img.setImgName(rs.getString("IMG_NAME"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}

}
