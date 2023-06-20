/*
 * Copyright (c) 2023 European Commission
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.europa.ec.eudi.sdjwt

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CombinedIssuanceSdJwtTest {

    @Disabled
    @Test
    fun testSplit() {
        val sdjwt = """
            eyJhbGciOiAiRVMyNTYifQ.eyJfc2QiOiBbIjVuWHkwWjNRaUViYTFWMWxKemVLaEFPR
            1FYRmxLTElXQ0xsaGZfTy1jbW8iLCAiOWdaaEhBaFY3TFpuT0ZacV9xN0ZoOHJ6ZHFyc
            k5NLWhSV3NWT2xXM251dyIsICJTLUpQQlNrdnFsaUZ2MV9fdGh1WHQzSXpYNUJfWlhtN
            FcycXM0Qm9ORnJBIiwgImJ2aXc3cFdBa2J6STA3OFpOVmFfZU1admswdGRQYTV3Mm85U
            jNaeWNqbzQiLCAiby1MQkNEckZGNnRDOWV3MXZBbFVtdzZZMzBDSFpGNWpPVUZocHg1b
            W9nSSIsICJwemtISU05c3Y3b1pINllLRHNScU5nRkdMcEVLSWozYzVHNlVLYVRzQWpRI
            iwgInJuQXpDVDZEVHk0VHNYOVFDRHYyd3dBRTRaZTIwdVJpZ3RWTlFrQTUyWDAiXSwgI
            mlzcyI6ICJodHRwczovL2V4YW1wbGUuY29tL2lzc3VlciIsICJpYXQiOiAxNTE2MjM5M
            DIyLCAiZXhwIjogMTczNTY4OTY2MSwgIl9zZF9hbGciOiAic2hhLTI1NiIsICJjbmYiO
            iB7Imp3ayI6IHsia3R5IjogIkVDIiwgImNydiI6ICJQLTI1NiIsICJ4IjogIlRDQUVSM
            TladnUzT0hGNGo0VzR2ZlNWb0hJUDFJTGlsRGxzN3ZDZUdlbWMiLCAieSI6ICJaeGppV
            1diWk1RR0hWV0tWUTRoYlNJaXJzVmZ1ZWNDRTZ0NGpUOUYySFpRIn19fQ.D7zXHQgMee
            BXNTiCmfq1SVRkixyj4mpZoxCLcuibWxa_eixmr5B-g-DPAY93k2rs1-PqSD5aKrqwHs
            rg_p2lRw~WyJyU0x1em5oaUxQQkRSWkUxQ1o4OEtRIiwgInN1YiIsICJqb2huX2RvZV8
            0MiJd~WyJhYTFPYmdlUkJnODJudnpMYnRQTklRIiwgImdpdmVuX25hbWUiLCAiSm9obi
            Jd~WyI2VWhsZU5HUmJtc0xDOFRndTh2OFdnIiwgImZhbWlseV9uYW1lIiwgIkRvZSJd~
            WyJ2S0t6alFSOWtsbFh2OWVkNUJ1ZHZRIiwgImVtYWlsIiwgImpvaG5kb2VAZXhhbXBs
            ZS5jb20iXQ~WyJVZEVmXzY0SEN0T1BpZDRFZmhPQWNRIiwgInBob25lX251bWJlciIsI
            CIrMS0yMDItNTU1LTAxMDEiXQ~WyJOYTNWb0ZGblZ3MjhqT0FyazdJTlZnIiwgImFkZH
            Jlc3MiLCB7InN0cmVldF9hZGRyZXNzIjogIjEyMyBNYWluIFN0IiwgImxvY2FsaXR5Ij
            ogIkFueXRvd24iLCAicmVnaW9uIjogIkFueXN0YXRlIiwgImNvdW50cnkiOiAiVVMifV
            0~WyJkQW9mNHNlZTFGdDBXR2dHanVjZ2pRIiwgImJpcnRoZGF0ZSIsICIxOTQwLTAxLT
            AxIl0
        """.trimIndent().trim()

        val (jwt, disclosures) = sdjwt.decompose().getOrThrow()
    }
}
