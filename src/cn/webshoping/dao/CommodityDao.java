package cn.itbaizhan.dao;

import java.util.List;

import cn.itbaizhan.po.Commodity;
import cn.itbaizhan.po.CommodityClass;
import cn.itbaizhan.po.ProductVO;
public interface CommodityDao {
	public void save(Commodity commodity);
	public void delete(Commodity commodity);
	public Commodity findCommodityById(int id);
	public Commodity upCommodityById(int id);
	public List<Commodity> findAllCommoditys();
	/**
	 * 设置图片保存的位置
	 * @param vo
	 */
	public void setImageUrl(ProductVO vo);
	public void update(Commodity commodity);
	public List<Commodity> findCommodityByName(String Name);
	public List<Commodity> findCommodityByClass(CommodityClass commodityclass);
	public List<Commodity> findCommodityBName(String name);
}
