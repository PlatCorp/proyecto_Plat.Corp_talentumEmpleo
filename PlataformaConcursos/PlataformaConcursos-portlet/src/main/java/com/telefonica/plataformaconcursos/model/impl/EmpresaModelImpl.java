package com.telefonica.plataformaconcursos.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.telefonica.plataformaconcursos.model.Empresa;
import com.telefonica.plataformaconcursos.model.EmpresaModel;
import com.telefonica.plataformaconcursos.model.EmpresaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Empresa service. Represents a row in the &quot;empresa&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.telefonica.plataformaconcursos.model.EmpresaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmpresaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpresaImpl
 * @see com.telefonica.plataformaconcursos.model.Empresa
 * @see com.telefonica.plataformaconcursos.model.EmpresaModel
 * @generated
 */
@JSON(strict = true)
public class EmpresaModelImpl extends BaseModelImpl<Empresa>
    implements EmpresaModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a empresa model instance should use the {@link com.telefonica.plataformaconcursos.model.Empresa} interface instead.
     */
    public static final String TABLE_NAME = "empresa";
    public static final Object[][] TABLE_COLUMNS = {
            { "empresaId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "nombre", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "sectorEmpresa", Types.VARCHAR },
            { "cif", Types.VARCHAR },
            { "pais", Types.VARCHAR },
            { "password1", Types.VARCHAR },
            { "password2", Types.VARCHAR },
            { "correoElectronico", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table empresa (empresaId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,nombre VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,sectorEmpresa VARCHAR(75) null,cif VARCHAR(75) null,pais VARCHAR(75) null,password1 VARCHAR(75) null,password2 VARCHAR(75) null,correoElectronico VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table empresa";
    public static final String ORDER_BY_JPQL = " ORDER BY empresa.empresaId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY empresa.empresaId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.telefonica.plataformaconcursos.model.Empresa"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.telefonica.plataformaconcursos.model.Empresa"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.telefonica.plataformaconcursos.model.Empresa"));
    private static ClassLoader _classLoader = Empresa.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Empresa.class
        };
    private long _empresaId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _nombre;
    private Date _createDate;
    private Date _modifiedDate;
    private String _sectorEmpresa;
    private String _cif;
    private String _pais;
    private String _password1;
    private String _password2;
    private String _correoElectronico;
    private Empresa _escapedModel;

    public EmpresaModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Empresa toModel(EmpresaSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Empresa model = new EmpresaImpl();

        model.setEmpresaId(soapModel.getEmpresaId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setNombre(soapModel.getNombre());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setSectorEmpresa(soapModel.getSectorEmpresa());
        model.setCif(soapModel.getCif());
        model.setPais(soapModel.getPais());
        model.setPassword1(soapModel.getPassword1());
        model.setPassword2(soapModel.getPassword2());
        model.setCorreoElectronico(soapModel.getCorreoElectronico());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Empresa> toModels(EmpresaSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Empresa> models = new ArrayList<Empresa>(soapModels.length);

        for (EmpresaSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _empresaId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmpresaId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _empresaId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Empresa.class;
    }

    @Override
    public String getModelClassName() {
        return Empresa.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("empresaId", getEmpresaId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("nombre", getNombre());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("sectorEmpresa", getSectorEmpresa());
        attributes.put("cif", getCif());
        attributes.put("pais", getPais());
        attributes.put("password1", getPassword1());
        attributes.put("password2", getPassword2());
        attributes.put("correoElectronico", getCorreoElectronico());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long empresaId = (Long) attributes.get("empresaId");

        if (empresaId != null) {
            setEmpresaId(empresaId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String nombre = (String) attributes.get("nombre");

        if (nombre != null) {
            setNombre(nombre);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String sectorEmpresa = (String) attributes.get("sectorEmpresa");

        if (sectorEmpresa != null) {
            setSectorEmpresa(sectorEmpresa);
        }

        String cif = (String) attributes.get("cif");

        if (cif != null) {
            setCif(cif);
        }

        String pais = (String) attributes.get("pais");

        if (pais != null) {
            setPais(pais);
        }

        String password1 = (String) attributes.get("password1");

        if (password1 != null) {
            setPassword1(password1);
        }

        String password2 = (String) attributes.get("password2");

        if (password2 != null) {
            setPassword2(password2);
        }

        String correoElectronico = (String) attributes.get("correoElectronico");

        if (correoElectronico != null) {
            setCorreoElectronico(correoElectronico);
        }
    }

    @JSON
    @Override
    public long getEmpresaId() {
        return _empresaId;
    }

    @Override
    public void setEmpresaId(long empresaId) {
        _empresaId = empresaId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getNombre() {
        if (_nombre == null) {
            return StringPool.BLANK;
        } else {
            return _nombre;
        }
    }

    @Override
    public void setNombre(String nombre) {
        _nombre = nombre;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getSectorEmpresa() {
        if (_sectorEmpresa == null) {
            return StringPool.BLANK;
        } else {
            return _sectorEmpresa;
        }
    }

    @Override
    public void setSectorEmpresa(String sectorEmpresa) {
        _sectorEmpresa = sectorEmpresa;
    }

    @JSON
    @Override
    public String getCif() {
        if (_cif == null) {
            return StringPool.BLANK;
        } else {
            return _cif;
        }
    }

    @Override
    public void setCif(String cif) {
        _cif = cif;
    }

    @JSON
    @Override
    public String getPais() {
        if (_pais == null) {
            return StringPool.BLANK;
        } else {
            return _pais;
        }
    }

    @Override
    public void setPais(String pais) {
        _pais = pais;
    }

    @JSON
    @Override
    public String getPassword1() {
        if (_password1 == null) {
            return StringPool.BLANK;
        } else {
            return _password1;
        }
    }

    @Override
    public void setPassword1(String password1) {
        _password1 = password1;
    }

    @JSON
    @Override
    public String getPassword2() {
        if (_password2 == null) {
            return StringPool.BLANK;
        } else {
            return _password2;
        }
    }

    @Override
    public void setPassword2(String password2) {
        _password2 = password2;
    }

    @JSON
    @Override
    public String getCorreoElectronico() {
        if (_correoElectronico == null) {
            return StringPool.BLANK;
        } else {
            return _correoElectronico;
        }
    }

    @Override
    public void setCorreoElectronico(String correoElectronico) {
        _correoElectronico = correoElectronico;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Empresa.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Empresa toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Empresa) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EmpresaImpl empresaImpl = new EmpresaImpl();

        empresaImpl.setEmpresaId(getEmpresaId());
        empresaImpl.setGroupId(getGroupId());
        empresaImpl.setCompanyId(getCompanyId());
        empresaImpl.setUserId(getUserId());
        empresaImpl.setNombre(getNombre());
        empresaImpl.setCreateDate(getCreateDate());
        empresaImpl.setModifiedDate(getModifiedDate());
        empresaImpl.setSectorEmpresa(getSectorEmpresa());
        empresaImpl.setCif(getCif());
        empresaImpl.setPais(getPais());
        empresaImpl.setPassword1(getPassword1());
        empresaImpl.setPassword2(getPassword2());
        empresaImpl.setCorreoElectronico(getCorreoElectronico());

        empresaImpl.resetOriginalValues();

        return empresaImpl;
    }

    @Override
    public int compareTo(Empresa empresa) {
        long primaryKey = empresa.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Empresa)) {
            return false;
        }

        Empresa empresa = (Empresa) obj;

        long primaryKey = empresa.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Empresa> toCacheModel() {
        EmpresaCacheModel empresaCacheModel = new EmpresaCacheModel();

        empresaCacheModel.empresaId = getEmpresaId();

        empresaCacheModel.groupId = getGroupId();

        empresaCacheModel.companyId = getCompanyId();

        empresaCacheModel.userId = getUserId();

        empresaCacheModel.nombre = getNombre();

        String nombre = empresaCacheModel.nombre;

        if ((nombre != null) && (nombre.length() == 0)) {
            empresaCacheModel.nombre = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            empresaCacheModel.createDate = createDate.getTime();
        } else {
            empresaCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            empresaCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            empresaCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        empresaCacheModel.sectorEmpresa = getSectorEmpresa();

        String sectorEmpresa = empresaCacheModel.sectorEmpresa;

        if ((sectorEmpresa != null) && (sectorEmpresa.length() == 0)) {
            empresaCacheModel.sectorEmpresa = null;
        }

        empresaCacheModel.cif = getCif();

        String cif = empresaCacheModel.cif;

        if ((cif != null) && (cif.length() == 0)) {
            empresaCacheModel.cif = null;
        }

        empresaCacheModel.pais = getPais();

        String pais = empresaCacheModel.pais;

        if ((pais != null) && (pais.length() == 0)) {
            empresaCacheModel.pais = null;
        }

        empresaCacheModel.password1 = getPassword1();

        String password1 = empresaCacheModel.password1;

        if ((password1 != null) && (password1.length() == 0)) {
            empresaCacheModel.password1 = null;
        }

        empresaCacheModel.password2 = getPassword2();

        String password2 = empresaCacheModel.password2;

        if ((password2 != null) && (password2.length() == 0)) {
            empresaCacheModel.password2 = null;
        }

        empresaCacheModel.correoElectronico = getCorreoElectronico();

        String correoElectronico = empresaCacheModel.correoElectronico;

        if ((correoElectronico != null) && (correoElectronico.length() == 0)) {
            empresaCacheModel.correoElectronico = null;
        }

        return empresaCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{empresaId=");
        sb.append(getEmpresaId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", nombre=");
        sb.append(getNombre());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", sectorEmpresa=");
        sb.append(getSectorEmpresa());
        sb.append(", cif=");
        sb.append(getCif());
        sb.append(", pais=");
        sb.append(getPais());
        sb.append(", password1=");
        sb.append(getPassword1());
        sb.append(", password2=");
        sb.append(getPassword2());
        sb.append(", correoElectronico=");
        sb.append(getCorreoElectronico());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.plataformaconcursos.model.Empresa");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>empresaId</column-name><column-value><![CDATA[");
        sb.append(getEmpresaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombre</column-name><column-value><![CDATA[");
        sb.append(getNombre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectorEmpresa</column-name><column-value><![CDATA[");
        sb.append(getSectorEmpresa());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cif</column-name><column-value><![CDATA[");
        sb.append(getCif());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pais</column-name><column-value><![CDATA[");
        sb.append(getPais());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>password1</column-name><column-value><![CDATA[");
        sb.append(getPassword1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>password2</column-name><column-value><![CDATA[");
        sb.append(getPassword2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>correoElectronico</column-name><column-value><![CDATA[");
        sb.append(getCorreoElectronico());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}