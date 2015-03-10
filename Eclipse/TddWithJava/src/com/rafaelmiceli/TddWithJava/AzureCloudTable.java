package com.rafaelmiceli.TddWithJava;

import com.microsoft.azure.storage.*;
import com.microsoft.azure.storage.table.*;

/**
 * Created by rafael.miceli on 09/03/2015.
 */
public class AzureCloudTable implements CloudTable {

    public final String storageConnectionString =
            "DefaultEndpointsProtocol=http;" +
                    "AccountName=Your-Account-Name;" +
                    "AccountKey=Your-Account-Key";

    public AzureCloudTable() {
        try {
            CloudStorageAccount cloudStorageAccount = CloudStorageAccount.parse(storageConnectionString);

            CloudTableClient cloudTableClient = cloudStorageAccount.createCloudTableClient();

            String tableName = "Your-Table-Name";
            com.microsoft.azure.storage.table.CloudTable cloudTable = new com.microsoft.azure.storage.table.CloudTable(tableName, cloudTableClient);
            cloudTable.createIfNotExists();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getTableName() {

        String tableName = "Nenhuma tabela encontrada";

        try
        {
            CloudStorageAccount storageAccount = CloudStorageAccount.parse(storageConnectionString);

            CloudTableClient tableClient = storageAccount.createCloudTableClient();

            for (String table : tableClient.listTables())
            {
                tableName = table;
            }

            return tableName;
        }
        catch (Exception e)
        {
            return tableName;
        }
    }
}
