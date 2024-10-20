'use client';

import { useState } from "react";
import Loading from "./Loading";

export default function SocialAccount() {
    const [loading, setLoading] = useState(false);

    const handleSocialAccount = () => {
        setLoading(!loading);
    }

    return (
        <>
            <div className="flex items-center my-5">
                <div className="flex-grow border-b border-gray-300"></div>
                <p className="mx-4 text-sm">Ou</p>
                <div className="flex-grow border-b border-gray-300"></div>
            </div>
            <button
                onClick={handleSocialAccount}
                className="bg-gray-100 border border-gray-300 hover:bg-gray-200 active:bg-gray-100 text-md rounded-lg w-full p-1.5 mb-8 flex justify-center items-center">

                {loading ? (
                    <Loading />
                ) : (
                    <>
                        <img
                            className="w-8"
                            src="https://img.icons8.com/?size=100&id=V5cGWnc9R4xj&format=png&color=000000"
                            alt="Entrar com a sua conta do Google" />
                        <p className="text-sm 2xl:text-base pl-2">Entre com o Google</p>
                    </>
                )}
            </button>
        </>
    )
}