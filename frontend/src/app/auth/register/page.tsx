"use client";

import { useState } from "react";
import Button from "@/src/components/auth/Button";
import Img from "@/src/components/auth/Img";
import Input from "@/src/components/auth/Input";
import SocialAccount from "@/src/components/auth/SocialAccount";
import Link from 'next/link';

export default function Register() {
    const [formData, setFormData] = useState({
        name: '',
        email: '',
        password: ''
    })

    const [isLoading, setIsLoading] = useState(false);

    const handleChange = (field: string, value: string) => {
        setFormData({ ...formData, [field]: value });
    }

    const handleRegister = async () => {
        setIsLoading(true);

        // Simulação de requisição, arrumar depois
        await new Promise((resolve) => setTimeout(resolve, 2000));

        setIsLoading(false);
    }

    return (
        <div className='sm:grid sm:grid-cols-[2fr_1fr] md:grid-cols-[3fr_2fr] xl:grid-cols-[2fr_3fr] h-screen sm:items-center overflow-x-hidden'>
            <div className="px-10 md:px-16 lg:px-24 xl:px-12 2xl:px-32 py-5 animate-slideToRight">
                <h1 className="text-3xl lg:text-4xl font-semibold tracking-wide text-center mb-5">Criar conta</h1>

                <form onSubmit={(e) => { e.preventDefault(); handleRegister(); }}>
                    <Input
                        type='text'
                        label="Seu nome"
                        placeholder="nome"
                        value={formData.name}
                        onChange={(e) => handleChange('name', e.target.value)} />

                    <Input
                        type='email'
                        label="Seu email"
                        placeholder="exemplo@gmail.com"
                        value={formData.email}
                        onChange={(e) => handleChange('email', e.target.value)} />

                    <Input
                        type='password'
                        label="Sua senha"
                        placeholder="senha123"
                        value={formData.password}
                        onChange={(e) => handleChange('password', e.target.value)} />

                    <p className="text-sm">Já tem uma conta?
                        <Link href="/auth/login">
                            <span className="font-black cursor-pointer hover:opacity-80"> Entre.</span>
                        </Link>
                    </p>

                    <Button isLoading={isLoading} text="Criar" />
                </form>
                
                <SocialAccount />
            </div>

            <Img animate="animate-slideToLeft" />
        </div>
    )
}
