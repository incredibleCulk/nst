//package com.mm.domen;
//
//import com.model.Aktivnost;
//import com.model.Dokument;
//import com.model.Podsistem;
//import com.model.Proces;
//import java.io.Serializable;
//import java.util.List;
//import java.util.Objects;
//import javax.persistence.Basic;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;
//
///**
// *
// * @author student1
// */
//@Entity
//@Table(name = "user")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
//    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
//    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
//    @NamedQuery(name = "User.findByFirstName", query = "SELECT u FROM User u WHERE u.firstName = :firstName"),
//    @NamedQuery(name = "User.findByLastName", query = "SELECT u FROM User u WHERE u.lastName = :lastName")})
//public class User implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "userID")
//    private Integer userID;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 255)
//    @Column(name = "ime")
//    private String ime;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 255)
//    @Column(name = "prezime")
//    private String prezime;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 255)
//    @Column(name = "ulica")
//    private String ulica;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 255)
//    @Column(name = "telefon")
//    private String telefon;
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "aktivan")
//    private boolean aktivan;
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "admin")
//    private boolean admin;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userID", fetch = FetchType.LAZY)
//    private List<Dokument> dokumentList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userID", fetch = FetchType.LAZY)
//    private List<Aktivnost> aktivnostList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userID", fetch = FetchType.LAZY)
//    private List<Podsistem> podsistemList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userID", fetch = FetchType.LAZY)
//    private List<Proces> procesList;
//
//    private static final long serialVersionUID = 41251387554598707L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private long id;
//    @NotNull
//    @Size(min = 1, max = 50)
//    @Column(name = "username")
//    private String username;
//    @Size(max = 50)
//    @Column(name = "password")
//    private String password;
//    @Size(max = 20)
//    @Column(name = "firstName")
//    private String firstName;
//    @Size(max = 20)
//    @Column(name = "lastName")
//    private String lastName;
//
//    public User() {
//    }
//
//    public User(String username, String password, String firstName, String lastName) {
//        this.username = username;
//        this.password = password;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 37 * hash + Objects.hashCode(this.username);
//        hash = 37 * hash + Objects.hashCode(this.password);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final User other = (User) obj;
//        if (!Objects.equals(this.username, other.username)) {
//            return false;
//        }
//        if (!Objects.equals(this.password, other.password)) {
//            return false;
//        }
//        return true;
//    }
//
//    public User(Integer userID) {
//        this.userID = userID;
//    }
//
//    public User(Integer userID, String ime, String prezime, String ulica, String telefon, boolean aktivan, boolean admin) {
//        this.userID = userID;
//        this.ime = ime;
//        this.prezime = prezime;
//        this.ulica = ulica;
//        this.telefon = telefon;
//        this.aktivan = aktivan;
//        this.admin = admin;
//    }
//
//    public Integer getUserID() {
//        return userID;
//    }
//
//    public void setUserID(Integer userID) {
//        this.userID = userID;
//    }
//
//    public String getIme() {
//        return ime;
//    }
//
//    public void setIme(String ime) {
//        this.ime = ime;
//    }
//
//    public String getPrezime() {
//        return prezime;
//    }
//
//    public void setPrezime(String prezime) {
//        this.prezime = prezime;
//    }
//
//    public String getUlica() {
//        return ulica;
//    }
//
//    public void setUlica(String ulica) {
//        this.ulica = ulica;
//    }
//
//    public String getTelefon() {
//        return telefon;
//    }
//
//    public void setTelefon(String telefon) {
//        this.telefon = telefon;
//    }
//
//    public boolean getAktivan() {
//        return aktivan;
//    }
//
//    public void setAktivan(boolean aktivan) {
//        this.aktivan = aktivan;
//    }
//
//    public boolean getAdmin() {
//        return admin;
//    }
//
//    public void setAdmin(boolean admin) {
//        this.admin = admin;
//    }
//
//    @XmlTransient
//    public List<Dokument> getDokumentList() {
//        return dokumentList;
//    }
//
//    public void setDokumentList(List<Dokument> dokumentList) {
//        this.dokumentList = dokumentList;
//    }
//
//    @XmlTransient
//    public List<Aktivnost> getAktivnostList() {
//        return aktivnostList;
//    }
//
//    public void setAktivnostList(List<Aktivnost> aktivnostList) {
//        this.aktivnostList = aktivnostList;
//    }
//
//    @XmlTransient
//    public List<Podsistem> getPodsistemList() {
//        return podsistemList;
//    }
//
//    public void setPodsistemList(List<Podsistem> podsistemList) {
//        this.podsistemList = podsistemList;
//    }
//
//    @XmlTransient
//    public List<Proces> getProcesList() {
//        return procesList;
//    }
//
//    public void setProcesList(List<Proces> procesList) {
//        this.procesList = procesList;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (userID != null ? userID.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof User)) {
//            return false;
//        }
//        User other = (User) object;
//        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mm.domen.User[ userID=" + userID + " ]";
//    }
//
//}
