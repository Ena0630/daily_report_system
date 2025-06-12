package actions.views;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 従業員情報について画面の入力値・出力値を扱うViewモデル
 */

@Getter // 全てのクラスフィールドについてgetterを自動生成する（Lombok）
@Setter // 全てのクラスフィールとについてsetterを自動生成する（Lombok）
@NoArgsConstructor // 引数なしコンストラクタを自動生成する（Lombok）
@AllArgsConstructor // 全てのクラスフィールドを引数に持つ引数ありコンストラクタを自動生成する（Lombok）
public class EmployeeView {
    
    /**
     * id
     */
    private Integer id;
    
    /**
     * 社員番号
     */
    private String code;
    
    /**
     * 氏名
     */
    private String name;
    
    /**
     * パスワード
     */
    private String password;
    
    /**
     * 管理者権限があるかどうか（一般：0、管理者：1）
     */
    private Integer adminFlag;
    
    /**
     * 登録日時
     */
    private LocalDateTime createdAt;
    
    /**
     * 更新日時
     */
    private LocalDateTime updatedAt;
    
    /**
     * 削除された従業員かどうか（現役：0、削除済み：1）
     */
    private Integer deleteFlag;

    
    public EmployeeView() {
        super();
    }
    
    public EmployeeView(Integer id, String code, String name, String password, Integer adminFlag,
            LocalDateTime createdAt, LocalDateTime updatedAt, Integer deleteFlag) {
        super();
        this.id = id;
        this.code = code;
        this.name = name;
        this.password = password;
        this.adminFlag = adminFlag;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deleteFlag = deleteFlag;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(Integer adminFlag) {
        this.adminFlag = adminFlag;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }


}
