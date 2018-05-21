import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManagerTests {
    private DBManager dbManager;

    @Before
    public void createDBManager() throws SQLException {
        dbManager = DBManager.getInstance();
    }

    @Test
    public void testConnect() throws SQLException {
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
            rs.getString("FIRSTNAME") + ", " +
            rs.getString("LASTNAME"));

            counter++;
        }
        rs.close();
        statement.close();

        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //When
        String sqlQuery = "SELECT u.firstname, u.lastname\n" +
                "FROM users u, posts p\n" +
                "WHERE u.id = p.user_id\n" +
                "GROUP BY p.user_id\n" +
                "HAVING COUNT(*) > 1;\n";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));

            counter++;
        }
        rs.close();
        statement.close();

        Assert.assertEquals(3, counter);
    }
}
