package com.microsoft.graph.conventions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.microsoft.graph.functional.TestBase;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

import org.junit.jupiter.api.Test;

import okhttp3.Request;

public class DeltaLinks {
    @Test
    public void testDeltaLinkParsing() {
        final TestBase base = new TestBase(false);
        final String token = "7ePNoMilh_6jGw8ZCAXfe7DBBYn5cAXbIlHDE9C1NqYBWrAmcZVRZNCeSQrOjsrQboz7DEeiB3ne78Yb6yFn4F49LhMk0eu8SAhfMyDC2yYWXGv1OXt80YGQ-rk-g7xaTcjs9Za6mQ78dwlC4apWq82EcFTjBF5V7rv4R17dMF9b0812qHLWS0aHX92TrmBBI26gLtO-_wAF2rKvltvQ8SNfJpeNyIxYO2t8fnSqaLml-ptZtgvbAPXTsJn9SpI7cDQlrZrWczdGS4yCOMUvpzClHLjb2CuKrxPcG2oD0jinB4IDB4ISC8gzb3Gst8j1cPgWMKC-Q-XVaonjz3hVi4eRVGqLtJefjuSIY8mCQv2tKTaKVfNvVSWvujtfQ6mGzLqeie0jOCI3M-w-U1iMnS3DNx6c-pGT6AmuSDjR_pR8stnqFeWKW_c5Vl8g9dbFefVHfuCelQ0WESf6rkqKReMnFM6WhExFczYCWZ42VnBBs5jEDnQpetkGf1n2x-27QLkwGUge_2cqCec8gU7lP4y43l7zBck5tP9S59TbJVJFtQ_-xw9PqMvFhnOfEciBwMubXXygEjYvltTdwiAwx4Fzaetc96GMG6Qz7SdyoSKqF5FsZvrNMsFcQAd6SjP_423-a-6ssDXeZWGQC0Sr2aLCJrXJPepfft-sTNLuPYL1Y_Pdl2DnCSvusM7tT3ONZNjRxYZhp3sZ56Su_AL0eA1pPcnqTwLpmbp7ifV2vZlG5AcXxTXYpidKjoQ1NRxIMe5ia-73-dszaMlG3wzdE_kqrJISg9UZ42W_5BdLpHNKS-dV4r2SOFzkm0qYlxWI4_p5P200C3dgP4JhODelQdEwFv-tM2NsxuDZ4EFtw2hexvRdkaVGvngqN21e32ZkAgh-aOS0uTDSRD6bE_TgIRoS53h8-Eps59wevGmgHNJUafsNICKU3XUYg0NAxohZ7t7lAsmM8Uu4L2Ex0MshI_SOVRp7Taj37NLWoaV-PYqgZIp9RNDagMYKZI4G4g2dPUIWsLq2g9dBwQNSQC2rX95hQeJAmsuQXJosmgWBn9a5JebhE_hBBiSU2YGAdNFpdBctBzwVfLJJnsNxpVYGAdc0aOa5o75WjM3fHozkMgmjVz7zz8GJLrBgEV7ArkCQNq2QZVMvZH81tLXsU6BtaBDCYH0_HdMjFArn4L3F6fapzv96DsK-ITKTIv5yra0s_u58XlLdGABKMcc5rXTAieH5W9Vio0jk1rohlXl1xwh42fWZBFAtFjEcFJ3XMke1nEqwro0BjmS6ERLJN395Wcsp7QVPisxI4VIx3wIBtdURZv7UDeRa9migUJPRjUgX4T2sHteOCPGWu_eIX6_9rlW0Lj2kfny-CMrn7f4S_jUgVeNdpMiknbRGIw2_8qUud93DEpaOs11vjLJnpCA5OYteyVt5hK5Pjy008R-tgvkYkrmUSwDWh58pWztAw2pK6bONIstjo1jc5hA9p8rcH4RPIbnMFJ2zmG8VbpsnQquPQquIIo0YLAzIeBgGiMwHjiaXPSKI_Ezuc3WsIYKlQkQHUFjI5YQUY9vBDTWzs0sHA3h_Z0jQbOGcekfeiRdFdvg_TjzTneHQG-oK1jqeCESQpb6-Oi-fJasDdjDSbmh_encE1o1OLJpiW3bCgawpgjhsI65Ygmf6CUhLNaIOaQmTtaUloF3xMk4gqtgFDNwPhuWl46U83N4sBlULJRgnuL9Douh6djW777BiU20ADrWdAO8QM0lluE3dD1LcyatAo2V6bfwozkGheYoABaoN-rlg9X2ovc5WluS56FtOs06rY1dUf8mV_qadzIgHdyYTE6qmQfnNHMVgZRxSQc4IRZwaXgT1GFq_A3Gr3bIVLbWkoNpwoITLekG6c6ISVaLNQNQD_-2mfHsvXRNJEJIIShqOL9HhJEARkK7U1yjvvlqjd05oIC65ylX2k6-jfITwAGttDBD177LMYDTJ-65ag4tPMUeZy0nUG9RePqfHs9NxSZmZf4cYct6CgsMEfi8ctUJuKhaA4MhLSKVBYTNkcy8bHAkuA7ROTopSqceWPOBuec1Ze7vp9FOQK6o0zKkgtk4rB6hBTAyGzBZybkqGisczxd-nMBYn8coqa-IiEeGWo85zfXolJBd4TLpjQWbZhUzfHlpAS64mGPDA6knY4B_cU1sLsMyxFU2m7RtlAomO5-B4ciOIebGDJIj5vg_p-6XShs6t3fERo-C43RDVG2dj-kB3Y4TxMhIRrXErdHXzI8d7Z1M6XAObh2JONHr2X48E9GRgexQEg0gRJKcPBeJaM38lt5oKIa9Pfi75ZApZlOUp6bmiJwIDORJ5eTaHzO-50pnZbzyt9uj8DAZnasj3nfrt1jzDWGmmdRqL2wNyWiiwxNWePivtJdCwr86L-qvHyqbQQjRgGpjI3xHAoAvLL717O2V6CDRIf_DGdt0Dct8DUtK9jnIaYSYukDes1FJeDj-KfF-lMdrm1K2EeTlB1pUdG_NaX1bknCmjkXy6lVgP3m3I_d7yNUVVpVsXz9kIbo-voEugmd8uo3tlx2etk_3oNU0WqGPI3xODpp_ENlpwnji1C_UO5eVGo8et9o2j482HpaEb1q-Alql0KlpgnNTb8tqGHLM3H3nf7zPJJ9Rd80tYJIBWQnzaCtLMCsvzqmTwjnOY8F0EQk6ZwLDJsee5xWeCVfpZ6ZzZH5ytcEsUWynoNM4fQvUbtt6yUu11y3AcZMP3vxfmwxou-o6tQXS_u_2W0OVjqgBk4r3FvhE0pmwNDEALIM1vbQoOASIwXBNKkvGL95AVaZZ8gxO9mX13R4KtV2PXt3QzVJOhYe0duB6gTr_Ng45doE6yNWn2tJlws3eywIhmLCh3dAqCHZghsZPltwRoqwY0Ib_JCuAnZsDA-scaRiL7ptFtIOXb1O1cT5ZRnM72lBxfkdEGKuDtv-TPo3okmqigtn4hckzaXeZlC42Ax2U2me5XqBj_Vkc9pSAwUN64-lm5cm_qrVwxy6pERuIGVP6xEh9HMBzDQgemJcurwfmKqZs.f1VLaUpVA-BopcJiSi_pLEUVB2GRt83Cbrw6x2n0Hy8";
        final IHttpRequest req = base.graphClient
                                    .users()
                                    .delta()
                                    .buildRequest()
                                    .deltaLink("https://graph.microsoft.com/v1.0/users/delta?$deltatoken=" + token)
                                    .withHttpMethod(HttpMethod.GET);
        assertEquals(2, req.getOptions().size());
        assertEquals(token, req.getOptions().get(1).getValue());// first one is telemetry header
    }
}
