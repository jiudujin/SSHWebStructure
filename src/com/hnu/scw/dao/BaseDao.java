package com.hnu.scw.dao;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * 最基础的basedao接口的设计
 * @param <T>
 */
@Repository
public interface BaseDao<T>{

    /**
     * 保存数据信息
     * @param t 参数是泛型，这样就具有通用性
     */
    public Long save(T t);

    /**
     * 更新数据操作
     * @param t
     */
    public void update(T t);
    /**
     * 根据对象进行删除内容，注意，传入的是对象类型，不是传主键ID
     * @param object 对象
     */
    public void deleteByObject(Serializable object);

    /**
     * 根据id主键来删除对象，区别上面的另外一个删除方法s
     * @param id 主键
     */
    public void deleteById(Serializable id);

    /**
     * 获取到对应id主键的对象内容(这是懒加载方式)
     * @param id 主键
     * @return
     */
    public T load(Serializable id);

    /**
     * 获取到对应id主键的对象内容（这是非懒加载，一般采取懒加载load策略来获取）
     * @param id
     * @return
     */
    public T get(Serializable id);

    /**
     * 获取对应查询内容的数据条数
     * @param hql
     * @param paras
     * @return
     */
    public Integer findTotalCount(String hql , Object[] paras);


    /**
     * 获取到HQL的查询实体数据
     * @param hql HQL查询语句
     * @param paras hql查询参数
     * @return 返回对应的model实体类
     */
    public List<T> findQueryModel(String hql , Object[] paras);

    /**
     * 获取到唯一的一条数据内容
     * 特别注意：这个用于传入的hql语句和参数保证，
     * 对于数据库中一定保证了只含有一条符合的数据，否则调用这个方法就会报错）
     * @param hql  查询的语句
     * @param paras 查询的参数
     * @return 返回对于的查询到的数据内容（只会返回一条）
     */
    public Object uniqueResult(String hql , Object[] paras);

    /**
     * 执行hql语句内容
     * @param hql  需要执行的hql语句
     * @param paras hql语句对应的参数
     * @return 返回执行hql语句后，操作的数据条数
     */
    public int executeHqlQuery(String hql , Object[] paras);

}
