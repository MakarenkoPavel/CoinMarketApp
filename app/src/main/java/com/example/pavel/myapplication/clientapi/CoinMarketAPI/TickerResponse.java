package com.example.pavel.myapplication.clientapi.CoinMarketAPI;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by Pavel on 7/28/2018.
 */

public class TickerResponse {

    @SerializedName("data")
    private Currency coin;
    @SerializedName("metadata")
    private Metadata metadata;

    public class Currency {

        private int id;
        private String name;
        private String symbol;
        private String website_slug;
        private String rank;
        private String circulating_supply;
        private String total_supply;
        private String max_supply;
        @SerializedName("quotes")
        private Map<String, Price> price;
        private String last_updated;

        public class Price {

            private String price;
            private String volume_24h;
            private String market_cap;
            private String percent_change_1h;
            private String percent_change_24h;
            private String percent_change_7d;

            public Price(String price, String volume_24h, String market_cap, String percent_change_1h, String percent_change_24h, String percent_change_7d) {
                this.price = price;
                this.volume_24h = volume_24h;
                this.market_cap = market_cap;
                this.percent_change_1h = percent_change_1h;
                this.percent_change_24h = percent_change_24h;
                this.percent_change_7d = percent_change_7d;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getVolume_24h() {
                return volume_24h;
            }

            public void setVolume_24h(String volume_24h) {
                this.volume_24h = volume_24h;
            }

            public String getMarket_cap() {
                return market_cap;
            }

            public void setMarket_cap(String market_cap) {
                this.market_cap = market_cap;
            }

            public String getPercent_change_1h() {
                return percent_change_1h;
            }

            public void setPercent_change_1h(String percent_change_1h) {
                this.percent_change_1h = percent_change_1h;
            }

            public String getPercent_change_24h() {
                return percent_change_24h;
            }

            public void setPercent_change_24h(String percent_change_24h) {
                this.percent_change_24h = percent_change_24h;
            }

            public String getPercent_change_7d() {
                return percent_change_7d;
            }

            public void setPercent_change_7d(String percent_change_7d) {
                this.percent_change_7d = percent_change_7d;
            }
        }

        public Currency(int id, String name, String symbol, String website_slug, String rank, String circulating_supply, String total_supply, String max_supply, Map<String, Price> price, String last_updated) {
            this.id = id;
            this.name = name;
            this.symbol = symbol;
            this.website_slug = website_slug;
            this.rank = rank;
            this.circulating_supply = circulating_supply;
            this.total_supply = total_supply;
            this.max_supply = max_supply;
            this.price = price;
            this.last_updated = last_updated;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getWebsite_slug() {
            return website_slug;
        }

        public void setWebsite_slug(String website_slug) {
            this.website_slug = website_slug;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getCirculating_supply() {
            return circulating_supply;
        }

        public void setCirculating_supply(String circulating_supply) {
            this.circulating_supply = circulating_supply;
        }

        public String getTotal_supply() {
            return total_supply;
        }

        public void setTotal_supply(String total_supply) {
            this.total_supply = total_supply;
        }

        public String getMax_supply() {
            return max_supply;
        }

        public void setMax_supply(String max_supply) {
            this.max_supply = max_supply;
        }

        public Map<String, Price> getPrice() {
            return price;
        }

        public void setPrice(Map<String, Price> price) {
            this.price = price;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }
    }

    public class Metadata {

        private String timestamp;
        private String error;

        public Metadata(String timestamp, String error) {
            this.timestamp = timestamp;
            this.error = error;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }
    }

    public TickerResponse(Currency coin, Metadata metadata) {
        this.coin = coin;
        this.metadata = metadata;
    }

    public Currency getCoin() {
        return coin;
    }

    public void setCoin(Currency coin) {
        this.coin = coin;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
